-- ========================================================
-- 197. Rising Temperature
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 526 ms (Beats 49%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/rising-temperature/
-- ========================================================

# Write your MySQL query statement below
select w1.id from Weather w1 join Weather w2 on w1.recordDate=SUBDATE(w2.recordDate, INTERVAL -1 DAY) where w1.temperature >w2.temperature;