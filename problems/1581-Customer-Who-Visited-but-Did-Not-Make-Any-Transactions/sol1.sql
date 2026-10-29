-- ========================================================
-- 1581. Customer Who Visited but Did Not Make Any Transactions
-- Difficulty : Easy
-- Language   : MySQL
-- Solution   : #1
-- Runtime    : 2175 ms (Beats 7%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/
-- ========================================================

# Write your MySQL query statement below
select distinct v.customer_id,count(v.visit_id) as count_no_trans from Visits as v where v.visit_id not in(
    select visit_id from transactions
)
group by customer_id;