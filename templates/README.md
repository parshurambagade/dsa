# Templates for Quick Problem Setup 📝

This folder contains reusable templates to maintain consistency when adding new problems.

## 📄 Available Templates

### 1. `problem.md`

Complete problem documentation template with all required sections:

- Problem statement
- Examples and test cases
- Constraints
- Approach overview table
- Key insights and learning notes
- Related problems

### 2. `solution.js`

JavaScript solution template with:

- JSDoc type annotations
- Comment structure for step-by-step logic
- Complexity analysis placeholders
- Test case examples

## 🚀 Quick Start

### Adding a New Problem

1. **Create problem folder**:

   ```bash
   mkdir -p TopicName/XX-problem-name/code
   ```

2. **Copy templates**:

   ```bash
   # Copy problem documentation
   cp templates/problem.md TopicName/XX-problem-name/problem.md

   # Copy solution template
   cp templates/solution.js TopicName/XX-problem-name/code/solution1.js
   ```

3. **Fill in the templates**:

   - Replace placeholders in `problem.md`
   - Implement solutions in `solution1.js`, `solution2.js`, etc.

4. **Update README files**:
   - Add entry to topic README (e.g., `Arrays/README.md`)
   - Update main `README.md` progress tracker

## 💡 Pro Tips

- Start with `problem.md` to understand the problem thoroughly
- Create `solution1.js` for brute force approach first
- Add optimized solutions as `solution2.js`, `solution3.js`
- Always include complexity analysis
- Test with edge cases before committing

## 📚 Example Usage

```bash
# Create "Two Sum" problem in Arrays
mkdir -p Arrays/02-two-sum/code

# Setup files
cp templates/problem.md Arrays/02-two-sum/
cp templates/solution.js Arrays/02-two-sum/code/solution1.js
cp templates/solution.js Arrays/02-two-sum/code/solution2.js

# Edit and implement
code Arrays/02-two-sum/problem.md
code Arrays/02-two-sum/code/solution1.js
```

---

See [CONTRIBUTING.md](../CONTRIBUTING.md) for detailed guidelines.
