<div align="center">

# 🧠 DSA Journey in Java

### From 52.9% to 64.52% Acceptance Rate Through Pattern-Based Learning

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,12,20&height=200&section=header" />

[![LeetCode Profile](https://img.shields.io/badge/LeetCode-Mikky__mlh-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/u/Mikky_mlh/)
[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Problems Solved](https://img.shields.io/badge/Problems_Solved-50_Unique-success?style=for-the-badge)](https://github.com/Mikky-mlh/DSA-LeetCode-Java)

<br/>

<img src="https://img.shields.io/badge/Started-November_20,_2025-6366F1?style=flat-square" />
<img src="https://img.shields.io/badge/Current_Phase-Foundations-3b82f6?style=flat-square" />
<img src="https://img.shields.io/badge/LeetCode_Acceptance-64.52%25-10b981?style=flat-square" />
<img src="https://img.shields.io/badge/Target-500+_by_May_2028-8b5cf6?style=flat-square" />

</div>

---

## 🎯 What This Repository Actually Is

**This isn't a random collection of LeetCode solutions.**

This is documentation of my structured DSA learning journey from November 2025 onward, tracking:
- Every problem solved (with multiple solution approaches where applicable)
- Pattern recognition methodology (learning approaches, not memorizing code)
- Complexity analysis for every solution (time/space tradeoffs)
- Acceptance rate improvement from 52.9% → 64.52% (through better testing habits)

**Goal:** 500+ problems solved by May 2028, ready for technical interviews at ₹20-35 LPA companies.

---

## ⚡ The Breakthrough: Pattern-First Learning

### What Was Broken (Nov 20-Dec 20)

**Initial approach:** Jump straight to problems, try to "figure it out" independently.

**Results:**
- Got stuck on problems for hours
- 52.9% acceptance rate (submitting half-baked solutions hoping they'd pass)
- Kept forgetting Java syntax (method signatures, collection operations)
- Optimal solutions felt "alien" because I was trying to discover them instead of learning them

**Reality check:** You can't independently "discover" optimal DSA solutions any more than you can independently "discover" calculus. This shit has been figured out by smarter people over decades. You LEARN the patterns, then APPLY them.

### What Changed (Dec 21 onward)

**New approach:** Pattern-first methodology.

**Workflow for EVERY problem:**
1. **Watch Striver's video** (5-15 min) → Learn the PATTERN, not just the solution
2. **Code independently** → Apply the pattern without looking at code
3. **Create 5-10 test cases locally** → Edge cases, max constraints, empty inputs
4. **Test in IDE first** → Only submit to LeetCode after all local tests pass
5. **Read 2-3 alternative approaches** → Understand different ways to solve it
6. **Document the pattern** → Note when to use this approach again

**Results:**
- Acceptance rate jumped from 52.9% → 64.52% (testing before submitting works!)
- Problems feel familiar because patterns repeat
- Can identify "this is a two-pointer problem" or "this needs a HashMap" immediately
- Multiple solutions per problem (optimization mindset, not just "get it accepted")

---

## 📊 Progress Tracker

<div align="center">

### Journey Statistics

| Metric | Value |
|:-------|:-----:|
| 🚀 **Started** | November 20, 2025 |
| 📅 **Days Active** | 35 days |
| ✅ **Unique Problems** | 50 solved |
| 🔄 **Total Implementations** | 60 (50 unique + 10 optimized) |
| 📈 **Acceptance Rate** | 64.52% ⬆️ (+11.62%) |
| 🎯 **LeetCode Profile** | [@Mikky_mlh](https://leetcode.com/u/Mikky_mlh/) |

</div>

> **Note:** Some problems in this repo aren't on LeetCode (paywalled or platform-exclusive). All solutions are documented here regardless of where they were solved.

---

### Section Breakdown

| Section | Problems Solved | Status | Next Target |
|:--------|:---------------:|:------:|:------------|
| **Patterns** | 17/17 | ✅ **Complete** | Universal methodology documented |
| **Basic Maths** | 31/31 | ✅ **Complete** | 9 problems with multiple solutions |
| **Misc/OOP** | 2/2 | ✅ **Complete** | Bank System + FIZZBUZZ |
| **Basic Recursion** | 0/7 | 🔄 **Next** | Starting Dec 26, 2025 |
| **Basic Hashing** | 0/6 | ⏳ **Planned** | After recursion |
| **Sorting** | 0/7 | ⏳ **Planned** | Q1 2026 |
| **Binary Search** | 0/32 | ⏳ **Planned** | Q1 2026 |

**TOTAL: 50 unique problems + 10 optimized versions = 60 total implementations**

---

## 🎓 What I've Actually Learned

### Patterns (17/17) - The Foundation ✅

**NOT just printing triangles for fun.** These taught me:
- **Analyzing structure:** What changes per row? What stays constant?
- **Deriving formulas:** `2*i+1` for odd numbers, `n-i-1` for centering, conditionals for diamond logic
- **Pattern recognition:** Same approaches apply to array problems, recursion, dynamic programming

**Key insight:** If you can't solve pattern problems systematically, you'll struggle with complex DSA. These build the mental model for breaking down problems.

**Documented methodology:** See [`PATTERN_RULES.txt`](./Patterns/PATTERN_RULES.txt) for universal framework.

---

### Basic Maths (31/31) - Optimization Fundamentals ✅

**Core patterns mastered:**

| Pattern | Time Complexity | When to Use | Example Problems |
|:--------|:----------------|:------------|:-----------------|
| **Digit Extraction** | O(log₁₀ n) | Any problem involving individual digits | Palindrome, Armstrong, Reverse |
| **Euclidean Algorithm** | O(log(min(a,b))) | GCD/HCF calculations | GCD, LCM |
| **√n Optimization** | O(√n) | Finding divisors, prime checks | Print Divisors, Prime Number |
| **Cycle Detection** | O(n) time, O(1) space | Detecting loops without extra storage | Happy Number (Floyd's) |
| **Two Pointers** | O(n) | Sorted array problems, optimization | Squares of Sorted Array |
| **Frequency Map** | O(n) | Counting occurrences | First Unique Character |

**9 problems with multiple solution approaches:**
- **LCM:** Brute force → Mathematical formula using GCD
- **Contains Duplicate:** HashSet.contains() → Sorting → HashSet.add() optimization
- **Happy Number:** HashSet cycle detection → O(1) space using math property
- **Perfect Number:** O(n) brute force → O(√n) optimization
- **Squares of Sorted Array:** ArrayList + sort → Two-pointer O(n)
- **First Unique Character:** indexOf comparison → Frequency array
- **Print Divisors:** O(n) iteration → O(√n) optimization
- **GCD/HCF:** Iterative → Recursive Euclidean
- **Divisors:** Basic O(n) → Optimized O(√n) with pair collection
- **Array Operations:** Multiple approaches for duplicate detection and array manipulation

---

### Java Collections Framework (9 concepts) - NOT Counted as DSA ✅

**Comprehensive understanding:**
- **List implementations:** ArrayList (random access, O(1) lookup) vs LinkedList (O(1) insertion at ends)
- **Set implementations:** HashSet (unordered, O(1) operations) vs TreeSet (sorted, O(log n) operations)
- **Map implementations:** HashMap (fast, O(1) lookup) vs TreeMap (sorted keys, O(log n) operations)
- **Queue/Stack:** ArrayDeque (preferred) vs Stack (legacy), PriorityQueue (heap-based ordering)
- **Advanced:** Custom `Comparator` for sorting, `equals()` and `hashCode()` overrides for custom objects

**Why this matters:** DSA problems require choosing the right data structure. Knowing when to use HashSet vs TreeSet or ArrayList vs LinkedList directly impacts time complexity.

---

## ⚡ Complexity Analysis Reference

Quick reference for patterns I've implemented:

```
DIGIT EXTRACTION:
Time: O(log₁₀ n)       // Number of digits in n
Space: O(1)            // Only storing a few variables
Example: Palindrome Number, Armstrong Number

EUCLIDEAN ALGORITHM (GCD):
Time: O(log(min(a,b)))  // Logarithmic reduction
Space: O(1)             // Iterative, no recursion stack
Example: GCD/HCF, LCM calculation

SQUARE ROOT OPTIMIZATION:
Time: O(√n)            // Only check divisors up to sqrt(n)
Space: O(d)            // d = number of divisors found
Example: Print Divisors, Prime Check, Perfect Number

CYCLE DETECTION (Floyd's):
Time: O(n)             // Linear traversal
Space: O(1)            // No extra storage (fast/slow pointers)
Example: Happy Number optimized solution

TWO POINTERS:
Time: O(n)             // Single pass through array
Space: O(1) or O(n)    // Depends if modifying in-place
Example: Squares of Sorted Array, future problems

FREQUENCY COUNTING:
Time: O(n)             // Single pass to build frequency map
Space: O(k)            // k = unique elements (or O(1) for fixed alphabets)
Example: First Unique Character, future hashing problems
```

---

## 🔧 My Problem-Solving Workflow

### Before Starting ANY Problem

```
1. Read problem statement twice
2. Check constraints → tells you acceptable time complexity
3. Think of brute force first → always have a working solution baseline
4. Ask: Have I seen this pattern before?
```

### While Solving

```
5. Code the approach with comments explaining logic
6. Create 5-10 test cases BEFORE running:
   - Empty input / single element
   - All same elements
   - Negative numbers (if applicable)
   - Maximum constraints (will it overflow? TLE?)
   - Edge cases specific to problem
7. Test locally in IDE until ALL cases pass
```

### After Solving

```
8. Submit to LeetCode (only after local tests pass)
9. Analyze complexity (time and space)
10. Read 2-3 alternative solutions
11. If optimized version exists, implement it
12. Document pattern for future problems
```

**This workflow is why my acceptance rate jumped 11.62%.**

---

## 📂 Repository Structure

```
DSA-LeetCode-Java/
│
├── 📁 Patterns/                    # 17 problems + universal methodology
│   ├── PATTERN_RULES.txt           # Framework for solving ANY pattern
│   ├── Triangle_Patterns.java      # Basic triangles (3 problems)
│   ├── Diamond_&_Butterfly.java    # Complex shapes (5 problems)
│   ├── Number_Patterns.java        # Numeric patterns (4 problems)
│   ├── Pascal_Triangle.java        # Pascal's triangle variations (2 problems)
│   └── Advanced_Patterns.java      # Multi-conditional patterns (3 problems)
│
├── 📁 Basic Maths/                 # 31 unique + 8 optimized = 39 files
│   ├── 📁 Modulus_Digit/           # 9 problems - digit manipulation
│   │   ├── Count_Digits.java
│   │   ├── Number_Reversed.java    # With overflow handling
│   │   ├── Palindrome.java         # O(1) space optimization
│   │   ├── Armstrong_Number.java
│   │   ├── Add_Digits.java         # Digital root using mod 9
│   │   ├── HappyNumber.java & HappyNumberOptimized.java  # HashSet → O(1) space
│   │   ├── Self_Dividing_number.java
│   │   ├── Smallest_Int_divisible_by_K.java
│   │   └── Count_the_Digits_that_Divide_a_Number.java
│   │
│   ├── 📁 HCF_LCM/                 # 3 problems - GCD/LCM algorithms
│   │   ├── HCF.java                # Euclidean algorithm
│   │   ├── LCM.java & LCM2.java    # Brute force → Optimized
│   │
│   ├── 📁 Divisors/                # 5 problems - divisor patterns
│   │   ├── Divisors.java & DivisorsOP.java           # O(n) → O(√n)
│   │   ├── PerfectNumber.java & PerfectNumberOP.java # O(n) → O(√n)
│   │   └── Ugly_Number.java
│   │
│   ├── 📁 Sieve_Prime/             # 4 problems - prime number algorithms
│   │   ├── Prime.java              # O(√n) optimization
│   │   ├── Count_Prime.java        # Sieve of Eratosthenes
│   │   ├── Prime_in_Range.java
│   │   └── SPFQ.java               # Smallest Prime Factor queries
│   │
│   ├── 📁 Array_Operations/        # 8 problems - array manipulation
│   │   ├── Duplicate.java, DuplicateB.java, DuplicateO.java  # 3 approaches
│   │   ├── Square_of_SortedArray.java & Square_of_SortedArray_OP.java
│   │   ├── AP.java                 # Arithmetic Progression check
│   │   ├── Closest_Number_to_Zero.java
│   │   └── Plus1.java              # Array digit increment
│   │
│   └── 📁 Miscellaneous/           # 7 problems - number theory
│       ├── Unique_char.java & Unique_char_O.java  # indexOf → Frequency array
│       ├── Pivot_Integer.java      # Mathematical formula optimization
│       ├── Excel_Column.java       # Base-26 conversion
│       ├── Expo.java               # Power calculation
│       ├── Fact_Zeroes.java        # Trailing zeros in factorial
│       ├── Power2.java             # Power of 2 check
│       └── SQRT.java               # Newton's method for square root
│
├── 📁 JAVA COLLECTIONS/            # 13 comprehensive demos (NOT DSA problems)
│   ├── L01ARRAYLIST.java           # Dynamic arrays, CRUD operations
│   ├── L02Stacks.java              # LIFO structure
│   ├── L03Queue.java               # FIFO structure, PriorityQueue
│   ├── L04ArrayDeque.java          # Double-ended queue
│   ├── L05HashSet.java             # HashSet, LinkedHashSet, TreeSet
│   ├── L06HashMap.java             # Key-value pairs, O(1) lookup
│   ├── L07TreeMap.java             # Sorted map, O(log n)
│   ├── L08ArrayCollections.java    # Array utilities
│   ├── L09Collections.java         # Collections utilities
│   ├── ComparableVsComparatorDemo.java  # Custom sorting
│   ├── Custom_Collections.java     # Custom objects in collections
│   ├── MovieComparable.java        # Comparable implementation
│   └── RatingComparator.java       # Comparator implementationucture
│   ├── Queue_Demo.java             # FIFO structure
│   ├── HashSet_Demo.java           # Unique elements, O(1) operations
│   ├── HashMap_Demo.java           # Key-value pairs, O(1) lookup
│   ├── TreeMap_Demo.java           # Sorted map, O(log n)
│   ├── Comparator_Demo.java       # Custom sorting logic
│   └── ... (2 more advanced demos)
│
├── 📁 Misc/                        # OOP implementations
│   ├── Bank.java                   # Account system with validation
│   └── FIZZBUZZ.java               # Classic interview problem
│
└── 📖 README.md                    # You're reading it
```

---

## ⚠️ About Copying Solutions

### If You're Here to Copy-Paste for LeetCode

**Don't.**

Here's why:
1. **You're sabotaging your interview prep** - Companies will expose this immediately in technical rounds
2. **You won't learn patterns** - Without understanding patterns, you can't solve new problems
3. **Your acceptance rate will suck** - You'll submit without testing, fail, and blame the "hard problem"
4. **You're wasting your time** - If you're not learning, you're just collecting green checkmarks that mean nothing

### How I Actually Use This Repository

**My approach:** Pattern recognition through systematic learning.

1. **Study patterns from educational resources** (Striver, GeeksForGeeks, etc.)
2. **Code independently** without looking at solutions
3. **Test locally** with edge cases
4. **Submit to LeetCode** only after local tests pass
5. **Read alternative solutions** to understand different approaches
6. **Document the pattern** for future reference

**This builds real problem-solving skills, not just "LeetCode accept" muscle memory.**

If you copy-paste from this repo and get caught in an interview, don't say I didn't warn you.

---

## 🎯 Milestones & Targets

### Completed ✅

- [x] **First 10 problems** - Nov 20-28, 2025 (Foundation built)
- [x] **First 30 problems** - Nov 29-Dec 22, 2025 (Pattern recognition solidifying)
- [x] **Pattern-first methodology** - Dec 21, 2025 (Breakthrough moment)
- [x] **64%+ acceptance rate** - Dec 23, 2025 (Testing discipline established)

### In Progress 🔄

- [x] **First 50 problems** - Target: Dec 31, 2025 (✅ **ACHIEVED EARLY** - Dec 25, 2025)
- [ ] **Basic Recursion complete** - Target: Jan 5, 2026 (7 problems)

### Upcoming 🎯

- [ ] **First 100 problems** - Target: Feb 2026
- [ ] **First 200 problems** - Target: Jun 2026 (Interview-ready for Easy level)
- [ ] **First 350 problems** - Target: Dec 2026 (Medium problems comfortable)
- [ ] **500+ problems** - Target: May 2028 (All levels, interview-ready)

---

## 📖 Resources I Actually Use

### Primary Learning Path

**Striver's A2Z DSA Course** (takeuforward.org/strivers-a2z-dsa-course)
- Structured curriculum covering all topics
- Pattern-based explanations (not just "here's the code")
- Why I use this: Teaches patterns systematically, doesn't just throw problems at you

**LeetCode** (leetcode.com/u/Mikky_mlh/)
- Problem practice platform
- Discussion section for alternative approaches
- Why I use this: Standard platform, good discussion section, tracks progress

### Supplementary Resources

**GeeksforGeeks** (geeksforgeeks.org)
- Algorithm explanations with visual diagrams
- Alternative code implementations
- Why I use this: Good for understanding "why" behind algorithms

**Visualization Tools**
- As I move into Trees/Graphs, I'll use visualizers for understanding traversals
- Recursion tree diagrams for understanding call stacks

### Why Java for DSA?

**Reasons I stick with Java:**
1. **Explicit typing teaches precision** - Forces you to think about data types (int vs long, ArrayList vs LinkedList)
2. **Industry standard in India** - Most companies use Java/C++ for interviews, not Python
3. **Rich Collections Framework** - Built-in data structures save time in interviews
4. **Preparation for production code** - Real-world enterprise apps use Java
5. **Performance matters** - Compiled language, faster execution for large inputs

---

## 🔮 What's Next

### Immediate Focus (Dec 26-31, 2025)

**Starting Basic Recursion:**
- Understanding recursion patterns (base case, recursive case, call stack)
- Building intuition for recursive thinking
- Target: 5-7 recursion problems by Dec 31
- Current: 50 unique problems solved (233% over revised target of 22)

### January 2026

**Complete Basic Recursion + Start Basic Hashing:**
- Finish all 7 recursion problems
- Begin hashing patterns (HashMap for frequency, HashSet for uniqueness)
- Target: 65-75 total problems by end of month

### Q1 2026 (Jan-Mar)

**Fundamentals Complete:**
- All basic sections done (Patterns, Maths, Recursion, Hashing, Sorting)
- Start medium difficulty problems
- Begin Arrays section (where most LeetCode problems live)
- Target: 100-120 total problems

### Beyond Q1 2026

**Structured progression through:**
- Binary Search (32 problems)
- Strings (25 problems)
- Linked Lists (52 problems)
- Stacks & Queues (42 problems)
- Trees (83 problems - this will take months)
- Graphs (79 problems - another massive section)
- Dynamic Programming (91 problems - the final boss)

**Long-term goal:** 500+ problems by May 2028, ready for ₹20-35 LPA technical interviews.

---

## 📫 Connect & Discuss

<div align="center">

[![GitHub](https://img.shields.io/badge/GitHub-Mikky--mlh-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Mikky-mlh)
[![LeetCode](https://img.shields.io/badge/LeetCode-Mikky__mlh-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com/u/Mikky_mlh/)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Yuvraj_Sarathe-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/yuvraj-sarathe)

<br/>

### 💬 Questions? Feedback? Discussion?

Feel free to open an issue or reach out. Always down to discuss:
- Problem-solving approaches
- Pattern recognition strategies
- Time/space complexity tradeoffs
- Learning methodology

</div>

---

<div align="center">

### 🎯 "Patterns are learned, not discovered. Solutions are earned, not copied."

**Made with ☕ and systematic learning by [Yuvraj Sarathe](https://github.com/Mikky-mlh)**

⭐ **Star this repo if the methodology helps you!**

<br/>

*Last Updated: December 25, 2025*  
*50 unique problems solved | 10 optimized versions | 64.52% acceptance rate*

</div>

<img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=6,12,20&height=120&section=footer" />
