<div align="center">

# 🧠 DSA Journey in Java

### Systematic DSA preparation through self-learning | Pattern-first learning approach

[![LeetCode](https://img.shields.io/badge/LeetCode-Mikky__mlh-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/u/Mikky_mlh/)
[![Java](https://img.shields.io/badge/Java-17+-007396?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems-33_Unique-success?style=for-the-badge)](https://github.com/Mikky-mlh/DSA-LeetCode-Java)

![Started](https://img.shields.io/badge/Started-November_20,_2025-orange?style=flat-square)
![Current Phase](https://img.shields.io/badge/Phase-Foundations-blue?style=flat-square)
![Acceptance Rate](https://img.shields.io/badge/LeetCode_Acceptance-64.52%25-success?style=flat-square)

</div>

---

## 📋 Table of Contents

- [About This Repository](#-about-this-repository)
- [Progress Tracker](#-progress-tracker)
- [Complexity Cheat Sheet](#-complexity-cheat-sheet)
- [Learning Approach](#-learning-approach)
- [Repository Structure](#-repository-structure)
- [What I've Learned](#-what-ive-learned)
- [Problem-Solving Workflow](#-problem-solving-workflow)
- [Resources](#-resources)
- [Important Note](#%EF%B8%8F-important-note)
- [Current Focus & Next Steps](#-current-focus--next-steps)
- [Connect](#-connect)

---

## 🎯 About This Repository

This repository documents my structured DSA learning journey from **November 2025** through self-learning and systematic practice.

**Journey Goals:**
- Master fundamental data structures and algorithms through pattern recognition
- Solve 500+ problems across all difficulty levels by May 2028
- Build interview-ready problem-solving skills for technical rounds

**Learning Philosophy:**
I don't memorize solutions—I learn **patterns**. Each problem teaches me a reusable approach that applies to dozens of similar problems. This repository showcases understanding, not just code.

---

## 📊 Progress Tracker

<div align="center">

### 📈 Journey Statistics

| Metric | Value |
|:-------|:-----:|
| 🚀 **Started** | November 20, 2025 |
| 📅 **Days Active** | 32 days |
| ✅ **Problems Solved** | 43 unique |
| 🔄 **Total Implementations** | 51 (43 unique + 8 optimized) |
| 🎯 **LeetCode Acceptance** | 64.52% ⬆️ |

**LeetCode Profile:** [@Mikky_mlh](https://leetcode.com/u/Mikky_mlh/)

</div>

> **Note:** The number of solutions on my LeetCode profile may differ from this repository due to certain problems being unavailable on the platform or restricted behind a paywall. These problems were completed on alternative platforms or solved locally, and all solutions are available in this repository.

---

### 🎓 Basics Mastery

| Topic | Completed | Status |
|:------|:---------:|:------:|
| **Java Collections** | 9/9 | ✅ Mastered |

---

### 💻 Problem-Solving Progress

| Section | Core Problems | Additional Solved | Total Solved | Status |
|:--------|:------------:|:----------------:|:------------:|:------:|
| [**Patterns**](./Patterns/) | 7/7 | 10 | 17 | ✅ Complete |
| [**Basic Maths**](./Basic%20Maths/) | 7/7 | 19 | 26 | ✅ Complete |
| [**MISC/OOP**](./Misc/) | N/A | 1 | 1 | ✅ Complete |
| [**Basic Recursion**](./Basic%20Recursion/) | 0/7 | 0 | 0 | 🔄 Next |
| [**Basic Hashing**](./Basic%20Hashing/) | 2/6 | 0 | 2 | ⏳ Started |
| **Sorting** | 0/7 | 0 | 0 | ⏳ Planned |
| **Binary Search** | 0/32 | 0 | 0 | ⏳ Planned |

---

### 🎯 Progress Milestones

- [x] ✅ **First 10 problems** - Foundation (Nov 20-28, 2025)
- [x] ✅ **First 30 problems** - Pattern recognition building (Nov 29-Dec 22, 2025)
- [ ] 🎯 **First 50 problems** - Basic patterns mastered (Target: Dec 31, 2025)
- [ ] **First 100 problems** - Confidence building (Target: Feb 2026)
- [ ] **First 200 problems** - Interview ready (Easy) (Target: Jun 2026)
- [ ] **First 350 problems** - Medium problems comfortable (Target: Dec 2026)
- [ ] **500+ problems** - Interview ready (All levels) (Target: May 2028)

---

## ⚡ Complexity Cheat Sheet

A summary of the time/space tradeoffs I have analyzed and implemented so far.

| Pattern/Topic | Best Time Complexity | Space Complexity | Example Problems |
|:--------------|:---------------------|:-----------------|:-----------------|
| **Digit Extraction** | $O(\log_{10} n)$ | $O(1)$ | Palindrome, Armstrong Number |
| **Euclidean Algorithm** | $O(\log(\min(a, b)))$ | $O(1)$ | GCD/HCF, LCM |
| **Divisors Check** | $O(\sqrt{n})$ | $O(1)$ | Print Divisors, Prime Check |
| **Cycle Detection** | $O(n)$ | $O(1)$ | Happy Number (Floyd's Cycle) |
| **Two Pointers** | $O(n)$ | $O(1)$ | Squares of Sorted Array (Optimized) |
| **Frequency Map** | $O(n)$ | $O(1)$ (fixed alphabet) | First Unique Character |

---

## 🎓 Learning Approach

### Pattern-First Methodology

I follow a **pattern-first learning approach** instead of randomly solving problems:

**My Workflow for Each Problem:**
1. **Study the pattern** (5-15 min) - Learn the PATTERN, not just the solution
2. **Attempt to code independently** - Apply the pattern on my own
3. **Create 5-10 test cases locally** - Test edge cases before submitting
4. **Submit to LeetCode** - Only after local tests pass (this improved my acceptance rate from 52.9% to 64.52%)
5. **Read 2-3 alternative solutions** - Understand different approaches
6. **Document the pattern** - Note when to use this approach again as well as the new optimized solution approach

**Why This Works:**
- Optimal DSA solutions are **LEARNED, not discovered**
- Trying to "figure out" patterns independently wastes time and causes frustration
- Learning patterns once applies to dozens of problems
- Understanding WHY a solution works > memorizing code

### Multiple Solutions = Optimization Mindset

**7 problems in this repo have multiple solution approaches (8 optimized files):**
- LCM: Brute force → Mathematical formula using GCD
- Contains Duplicate: Three approaches (HashSet contains, sorting, HashSet.add())
- Happy Number: HashSet cycle detection → O(1) space using math property
- Perfect Number: O(n) → O(√n) optimization
- Squares of Sorted Array: ArrayList + sort → Two-pointer O(n)
- First Unique Character: Two approaches (indexOf comparison, frequency array)
- Print Divisors: O(n) brute force → O(√n) optimization

**This demonstrates:** Understanding time/space tradeoffs, not just "getting it accepted"

---

## 📂 Repository Structure

```

DSA-LeetCode-Java/

│

├── 📁 Basic Maths/              # 26 problems (7 core + 19 additional) + 8 optimized versions

│   ├── Count_Digits.java

│   ├── Number_Reversed.java

│   ├── Palindrome.java

│   ├── HCF.java

│   ├── LCM.java & LCM2.java    # Brute force + Optimized

│   ├── Armstrong_Number.java

│   ├── Prime.java

│   ├── Divisors.java & Divisors_int.java  # O(n) + O(√n)

│   ├── Duplicate.java, DuplicateB.java, DuplicateO.java  # 3 approaches

│   ├── HappyNumber.java & HappyNumberOptimized.java  # HashSet + Math property

│   ├── PerfectNumber.java & PerfectNumberOP.java  # O(n) + O(√n)

│   ├── Square_of_SortedArray.java & Square_of_SortedArray_OP.java  # Sort + Two-pointer

│   ├── First_unique_Char_in_Str.java & Unique_char_O.java  # indexOf + Frequency array

│   └── [18+ more problems]

│

├── 📁 JAVA COLLECTIONS/         # 9 comprehensive demos

│   ├── L01ARRAYLIST.java       # ArrayList with all methods

│   ├── L02Stacks.java          # Stack (LIFO - Last In First Out)

│   ├── L03Queue.java           # Queue & PriorityQueue (FIFO - First In First Out)

│   ├── L04ArrayDeque.java      # Double-ended queue

│   ├── L05HashSet.java         # HashSet, LinkedHashSet, TreeSet

│   ├── L06HashMap.java         # HashMap operations

│   ├── L07TreeMap.java         # TreeMap (sorted keys)

│   ├── L08ArrayCollections.java

│   └── L09Collections.java     # Collections utility methods

│

├── 📁 Patterns/                 # 17 pattern problems + comprehensive guide

│   ├── PATTERN_RULES.txt       # Universal pattern solving methodology

│   ├── Pattern1.java - Pattern17.java

│   └── [Includes: Triangle, Diamond, Butterfly, Pascal's Triangle, etc.]

│

├── 📁 Misc/                     # Object-oriented problems

│   └── Bank.java               # Bank system with transfer/deposit/withdraw

│

├── 📄 .gitignore

└── 📖 README.md                # This file

```

---

## 📚 What I've Learned

### Patterns (17/17 Complete) ✅

**Mastered Pattern-Solving Framework:**
- Analyzed structure: rows, columns, what changes per row
- Derived formulas instead of memorizing patterns
- Common formulas: `2*i+1` (odd numbers), `n-i-1` (centering), `i>n ? formula2 : formula1` (diamond logic)
- Documented universal rules in `PATTERN_RULES.txt`

### Basic Maths (26/26 Complete) ✅

**Core Patterns Learned:**
- **Digit Extraction:** `n % 10` (last digit), `n / 10` (remove last digit)
- **Euclidean Algorithm:** GCD using recursion - `gcd(a,b) = gcd(b, a%b)`
- **Mathematical Properties:** LCM formula `(a*b)/GCD`, Digital Root using `mod 9`
- **Square Root Optimization:** O(√n) for divisor problems (used in 3 problems)

### Java Collections Framework (9/9 Mastered) ✅

**Comprehensive Understanding:**
- **List:** ArrayList (Random access) vs LinkedList (Insertion)
- **Set:** HashSet (Unordered) vs TreeSet (Sorted)
- **Map:** HashMap (Speed) vs TreeMap (Order)
- **Advanced:** Custom `Comparator` implementation and `hashCode()` overrides.

---

## 🔧 Problem-Solving Workflow

### Before Starting Any Problem

1. **Identify the category** - Array? String? Math? Tree?
2. **Read problem constraints** - Input size tells you acceptable time complexity
3. **Think of brute force first** - Always have a working solution
4. **Check if pattern exists** - Have I seen this before?

### While Solving

5. **Code the approach** - Write clean, commented code
6. **Create test cases** - Think of edge cases:
   - Empty input
   - Single element
   - All same elements
   - Negative numbers (if applicable)
   - Maximum constraints
7. **Test locally** - Run through all test cases in IDE

### After Solving

9. **Submit to LeetCode** - Only after local tests pass
10. **Analyze complexity** - Calculate time and space
11. **Optimize if possible** - Can time or space be improved?

---

## 📖 Resources

### Primary Learning Resources

**Self-Learning Resources**
- Approach: Structured DSA curriculum focusing on patterns, not just solutions
- Why: Understanding patterns builds real problem-solving skills

**LeetCode**
- Profile: [@Mikky_mlh](https://leetcode.com/u/Mikky_mlh/)
- How I use: Problem practice, reading alternative solutions

**Visualization Tools (Upcoming)**
- As I move into Recursion, I will be using recursion tree diagrams to visualize stack trace execution.

### Why Java?

**Reasons I chose Java for DSA:**
1. **Explicit typing teaches precision** - Forces understanding of data types
2. **Industry standard in India** - LEGACY CODE
3. **Strong Collections Framework** - Rich built-in data structures
4. **Preparation for production code** - Real-world applications use Java

---

## ⚠️ Important Note

### About Copying Solutions

**This repository contains MY solutions after learning patterns from educational resources.**

**If you're here to copy-paste for LeetCode submissions:**
- You're sabotaging your own learning
- You won't learn the patterns needed for interviews
- Companies will expose this in technical rounds immediately

**My approach:** Pattern recognition through systematic learning. I study patterns from various resources, code independently, test locally, then submit. This builds real problem-solving skills.

---

## 🎯 Current Focus & Next Steps

**Right Now (Dec 23-31, 2025):**
- Starting **Basic Recursion** (7 problems)
- Understanding recursion patterns: base cases, recursive cases, call stack
- Target: 5-7 recursion problems by Dec 31

**January 2026:**
- Complete Basic Recursion
- Start Basic Hashing (6 problems)
- Begin transitioning to Medium difficulty

---

## 📞 Connect

<div align="center">

[![GitHub](https://img.shields.io/badge/GitHub-Mikky--mlh-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Mikky-mlh)
[![LeetCode](https://img.shields.io/badge/LeetCode-Mikky__mlh-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/u/Mikky_mlh/)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Yuvraj_Sarathe-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/yuvraj-sarathe)

### 💬 Questions or Suggestions?

Feel free to open an issue or reach out. Always happy to discuss problem-solving approaches!

</div>

---

<div align="center">

### 🎯 "Patterns are learned, not discovered. Solutions are earned, not copied."

**Made with ☕ and determination by [Yuvraj Sarathe](https://github.com/Mikky-mlh)**

⭐ **Star this repo if you found it helpful!**

*Last Updated: December 23, 2025*

</div>


