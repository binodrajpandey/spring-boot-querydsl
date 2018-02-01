///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.example.demo;
//
///**
// *
// * @author binod
// */
//public class UserPredicateBuilder {
//    private List<SearchCriteria> params;
// 
//    public MyUserPredicatesBuilder() {
//        params = new ArrayList<>();
//    }
// 
//    public MyUserPredicatesBuilder with(
//      String key, String operation, Object value) {
//   
//        params.add(new SearchCriteria(key, operation, value));
//        return this;
//    }
// 
//    public BooleanExpression build() {
//        if (params.size() == 0) {
//            return null;
//        }
// 
//        List<BooleanExpression> predicates = new ArrayList<>();
//        MyUserPredicate predicate;
//        for (SearchCriteria param : params) {
//            predicate = new MyUserPredicate(param);
//            BooleanExpression exp = predicate.getPredicate();
//            if (exp != null) {
//                predicates.add(exp);
//            }
//        }
// 
//        BooleanExpression result = predicates.get(0);
//        for (int i = 1; i < predicates.size(); i++) {
//            result = result.and(predicates.get(i));
//        }
//        return result;
//    }
//    
//}
