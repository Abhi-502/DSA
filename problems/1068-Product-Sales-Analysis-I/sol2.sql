-- ========================================================
-- 1068. Product Sales Analysis I
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #2
-- Runtime    : 2570 ms (Beats 5%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/product-sales-analysis-i/
-- ========================================================

# Write your MySQL query statement below
select p.product_name,s.year,s.price from Sales as s Join Product as p on s.product_id=p.product_id