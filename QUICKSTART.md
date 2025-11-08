# Quick Start 🚀

Simple guide for my NeetCode 150 journey.

## 📁 Structure

```
dsa/
└── Arrays/
    └── 01-contains-duplicate/
        ├── problem.md        # Problem + my notes
        └── code/
            ├── solution1.js  # Approach 1
            ├── solution2.js  # Approach 2
            └── solution3.js  # Approach 3 (optimal)
```

## 🆕 Adding a Problem

### Option 1: Use Script

```bash
./scripts/new-problem.sh
# Follow prompts
```

### Option 2: Manual

```bash
mkdir -p TopicName/XX-problem-name/code
cp templates/problem.md TopicName/XX-problem-name/
cp templates/solution.js TopicName/XX-problem-name/code/solution1.js
cp templates/solution.js TopicName/XX-problem-name/code/solution2.js
```

## 📚 Study Flow

1. Read `problem.md`
2. Try solving (10-15 min)
3. Study solutions (simplest → optimal)
4. Add my learning notes
5. Update progress in `README.md`

## ✅ After Solving

Update the tracker in `README.md`:

```markdown
| 2 | [Problem Name](./path/) | 🟢 Easy | ✅ Done | 2 |
```

## 🔧 Git

```bash
git add .
git commit -m "Solve: Arrays/02-two-sum"
git push
```

---

**Keep it simple. Focus on learning patterns!**
