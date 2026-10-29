-- ========================================================
-- 1378. Replace Employee ID With The Unique Identifier
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #2
-- Runtime    : 1652 ms (Beats 15%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/
-- ========================================================

# Write your MySQL query statement below
select u.unique_id,e.name from Employees as e Left Join EmployeeUNI as u on u.id=e.id