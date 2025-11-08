#!/bin/bash

# DSA Problem Setup Script
# Quick setup for adding new problems to the repository

set -e

echo "🚀 DSA Problem Setup"
echo "===================="
echo ""

# Get topic
echo "📁 Select topic (or create new):"
echo "   1. Arrays"
echo "   2. Strings"
echo "   3. LinkedLists"
echo "   4. Trees"
echo "   5. Graphs"
echo "   6. DynamicProgramming"
echo "   7. Other (specify)"
echo ""
read -p "Enter choice (1-7): " topic_choice

case $topic_choice in
    1) TOPIC="Arrays" ;;
    2) TOPIC="Strings" ;;
    3) TOPIC="LinkedLists" ;;
    4) TOPIC="Trees" ;;
    5) TOPIC="Graphs" ;;
    6) TOPIC="DynamicProgramming" ;;
    7) read -p "Enter topic name (PascalCase): " TOPIC ;;
    *) echo "❌ Invalid choice"; exit 1 ;;
esac

# Get problem number
read -p "📝 Problem number (e.g., 02): " PROBLEM_NUM

# Get problem name
read -p "📝 Problem name (kebab-case, e.g., two-sum): " PROBLEM_NAME

# Construct paths
PROBLEM_DIR="${TOPIC}/${PROBLEM_NUM}-${PROBLEM_NAME}"
CODE_DIR="${PROBLEM_DIR}/code"

# Check if directory exists
if [ -d "$PROBLEM_DIR" ]; then
    echo "⚠️  Directory $PROBLEM_DIR already exists!"
    read -p "Continue anyway? (y/n): " confirm
    if [ "$confirm" != "y" ]; then
        echo "Aborted."
        exit 1
    fi
fi

# Create directory structure
echo ""
echo "📂 Creating directory structure..."
mkdir -p "$CODE_DIR"

# Copy templates
echo "📄 Copying templates..."
cp templates/problem.md "$PROBLEM_DIR/problem.md"
cp templates/solution.js "$CODE_DIR/solution1.js"
cp templates/solution.js "$CODE_DIR/solution2.js"

echo ""
echo "✅ Setup complete!"
echo ""
echo "📍 Created:"
echo "   $PROBLEM_DIR/"
echo "   ├── problem.md"
echo "   └── code/"
echo "       ├── solution1.js"
echo "       └── solution2.js"
echo ""
echo "📝 Next steps:"
echo "   1. Edit $PROBLEM_DIR/problem.md"
echo "   2. Implement solutions in $CODE_DIR/"
echo "   3. Update $TOPIC/README.md"
echo "   4. Update main README.md"
echo ""
echo "💡 See CONTRIBUTING.md for detailed guidelines"
echo ""
