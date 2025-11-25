# Build and Test Script for Encryption Project

Write-Host "=== Encryption Project Build Script ===" -ForegroundColor Cyan

# Create directories
Write-Host "`nCreating directories..." -ForegroundColor Yellow
New-Item -ItemType Directory -Force -Path "lib" | Out-Null
New-Item -ItemType Directory -Force -Path "out" | Out-Null

# Download JUnit if not present
if (-not (Test-Path "lib\junit.jar")) {
    Write-Host "Downloading JUnit 4.13.2..." -ForegroundColor Yellow
    Invoke-WebRequest -Uri "https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar" -OutFile "lib\junit.jar"
    Write-Host "JUnit downloaded successfully" -ForegroundColor Green
} else {
    Write-Host "JUnit already exists" -ForegroundColor Green
}

if (-not (Test-Path "lib\hamcrest-core.jar")) {
    Write-Host "Downloading Hamcrest Core 1.3..." -ForegroundColor Yellow
    Invoke-WebRequest -Uri "https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar" -OutFile "lib\hamcrest-core.jar"
    Write-Host "Hamcrest Core downloaded successfully" -ForegroundColor Green
} else {
    Write-Host "Hamcrest Core already exists" -ForegroundColor Green
}

# Compile all source files
Write-Host "`nCompiling source and test files..." -ForegroundColor Yellow
javac -cp "lib\junit.jar;lib\hamcrest-core.jar" -sourcepath . -d out src\Encryption.java test\java\EncryptionTester.java
if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilation failed!" -ForegroundColor Red
    exit 1
}
Write-Host "All files compiled successfully" -ForegroundColor Green

# Run tests
Write-Host "`nRunning tests..." -ForegroundColor Yellow
java -cp "out;lib\junit.jar;lib\hamcrest-core.jar" org.junit.runner.JUnitCore EncryptionTester

if ($LASTEXITCODE -eq 0) {
    Write-Host "`nAll tests passed!" -ForegroundColor Green
} else {
    Write-Host "`nSome tests failed!" -ForegroundColor Red
    exit 1
}
