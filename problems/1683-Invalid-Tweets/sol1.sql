-- ========================================================
-- 1683. Invalid Tweets
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 675 ms (Beats 42%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/invalid-tweets/
-- ========================================================

# Write your MySQL query statement below
select tweet_id from Tweets where length(content)>15