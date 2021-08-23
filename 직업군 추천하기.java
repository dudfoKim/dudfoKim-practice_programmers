import java.util.Collections;

import java.util.Comparator;

import java.util.HashMap;

import java.util.LinkedList;

import java.util.List;

import java.util.Map;

import java.util.Map.Entry;


class Solution

{

    public String solution(String[] table, String[] languages, int[] preference)

    {

        String[] sector = new String[5]; // 직업군 배열(5개 고정)

        HashMap<String, Integer> map = new HashMap<String, Integer>(); // 직업군별 합산점수

        String[][] score_table = new String[5][5]; // table 변수 전처리용

        int[][] score_result = new int[5][languages.length]; // 직업/언어별 선호점수

        

        // table => score_table + sector배열로 처리

        for(int i=0; i<table.length; i++)

        {

            String[] temp = table[i].split(" ");

            sector[i] = temp[0]; // 첫 번째 변수 : 무조건 직업군

            

            for(int j=0; j<=4; j++) // 그 외 변수 : 앞에 나온 언어부터 5~1점 차등부여

            {

                score_table[i][4-j] = temp[j+1];

            }

        }

        

        // 언어별 점수계산

        for(int k=0; k<languages.length; k++)

        {

            String lang = languages[k];

            

            for(int i=0; i<score_table.length; i++)

            {

                for(int j=0; j<score_table[i].length; j++)

                {

                    // 일치하는 언어가 있으면 점수를 업데이트하고 멈춰!

                    if(score_table[i][j].equals(lang))

                    {

                        score_result[i][k] = j+1;

                        break;

                    }

                }

            }

        }

        

        // Map 자료형에 (직업군, 점수) 짝으로 넣기

        for(int i=0; i<score_result.length; i++)

        {

            int sum = 0;

            

            for(int j=0; j<preference.length; j++)

            {

                sum += (preference[j] * score_result[i][j]);

            }

            

            map.put(sector[i], sum);

        }

        

        // 정렬을 위한 리스트 구조 선언

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());

        

        // 점수 - 직업군 순으로 정렬 실행

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

            @Override

            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2){

                if(o2.getValue()==o1.getValue()) // 점수가 같을 때 직업군의 사전 순으로 오름차순 정렬

                {

                    return o1.getKey().compareTo(o2.getKey());

                }

                else // 점수가 다르면 점수에 따른 내림차순 정렬

                {

                    return o2.getValue().compareTo(o1.getValue());

                }

            }

        });

            

        return list.get(0).getKey();

    }

}

