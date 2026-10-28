-- ========================================================
-- 1757. Recyclable and Low Fat Products
-- Difficulty : Easy
-- Language   : Oracle SQL
-- Solution   : #1
-- Runtime    : 507 ms (Beats 96%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/recyclable-and-low-fat-products/
-- ========================================================

select product_id from Products where low_fats='Y' and recyclable='Y'