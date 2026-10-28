-- ========================================================
-- 1148. Article Views I
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 528 ms (Beats 19%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/article-views-i/
-- ========================================================

# Write your MySQL query statement below
select distinct author_id as id  from Views where author_id=viewer_id order by author_id asc;