Hai this is updated file in development git branch
hai this is db utils .java

name: CI/CD Pipeline

on:
  push:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      # Step 1: Checkout the code
      - name: Checkout Code
        uses: actions/checkout@v2

      # Step 2: Set up Node.js (or Python, Java, etc.)
      - name: Set up Node.js
        uses: actions/setup-node@v2
        with:
          node-version: '14'

      # Step 3: Install dependencies
      - name: Install Dependencies
        run: npm install

      # Step 4: Run Tests
      - name: Run Tests
        run: npm test

  deploy:
    runs-on: ubuntu-latest
    needs: build  # Ensure deployment happens only after the build job passes

    steps:
      # Step 1: Checkout the code again for deployment
      - name: Checkout Code
        uses: actions/checkout@v2

      # Step 2: Deploy to staging or production environment
      - name: Deploy to Staging
        run: |
          echo "Deploying to stagin

