-- ========================================================
-- 595. Big Countries
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 344 ms (Beats 24%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/big-countries/
-- ========================================================

# Write your MySQL query statement below
select name,population,area from World where area >= 3000000 or population >= 25000000