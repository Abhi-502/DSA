-- ========================================================
-- 1757. Recyclable and Low Fat Products
-- Difficulty : Easy
-- Language   : Oracle SQL
-- Solution   : #2
-- Runtime    : 672 ms (Beats 30%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/recyclable-and-low-fat-products/
-- ========================================================

select product_id from Products where low_fats='Y' and recyclable='Y'