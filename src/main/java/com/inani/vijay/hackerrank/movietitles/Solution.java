package com.inani.vijay.hackerrank.movietitles;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Solution {
    public static void main(String[] args) {
        String title = "Spiderman";
        String[] result = getMovieTitles(title);
        for (String str : result) {
            System.out.println(str);
        }
    }

    static String[] getMovieTitles(String substr) {

        Info info = getHeaderInfo(substr);

        List<String> finalTitles = new ArrayList<>(info.getTotalRecords());

        for (int i = 0; i < info.getTotalPages(); i++) {
            List<String> titles = getRecords(substr, i + 1);
            finalTitles.addAll(titles);
        }

        String[] results = new String[info.getTotalRecords()];
        int j = 0;
        for (String title : finalTitles) {
            results[j] = title;
            j++;
        }
        Arrays.sort(results);
        return results;
    }

    private static List<String> getRecords(String substr, int i) {
        Titles titles = null;
        List<String> titlesOther = null;
        try {
            String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=" + i;
            StringBuffer response = getRestResponse(url);

            Gson gson = new Gson();
            titles = gson.fromJson(response.toString(), Titles.class);
            Data[] data = titles.getData();
            titlesOther = new ArrayList<>();

            for (Data data1 : data) {
                titlesOther.add(data1.getTitle());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return titlesOther;
    }

    private static Info getHeaderInfo(String substr) {

        Titles titles = null;
        try {
            String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr;
            StringBuffer response = getRestResponse(url);

            Gson gson = new Gson();
            titles = gson.fromJson(response.toString(), Titles.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Info info = new Info();
        info.setTotalPages(Integer.parseInt(titles.getTotal_pages()));
        info.setTotalRecords(Integer.parseInt(titles.getTotal()));
        return info;
    }

    private static StringBuffer getRestResponse(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response;
    }

    public static class Data {
        private String Poster;
        private String Title;
        private String Type;
        private String Year;
        private String imdbID;

        public Data() {
        }

        public Data(String poster, String title, String type, String year, String imdbID) {
            Poster = poster;
            Title = title;
            Type = type;
            Year = year;
            this.imdbID = imdbID;
        }

        public String getPoster() {
            return Poster;
        }

        public void setPoster(String poster) {
            Poster = poster;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            Title = title;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

        public String getYear() {
            return Year;
        }

        public void setYear(String year) {
            Year = year;
        }

        public String getImdbID() {
            return imdbID;
        }

        public void setImdbID(String imdbID) {
            this.imdbID = imdbID;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return Objects.equals(Poster, data.Poster) &&
                    Objects.equals(Title, data.Title) &&
                    Objects.equals(Type, data.Type) &&
                    Objects.equals(Year, data.Year) &&
                    Objects.equals(imdbID, data.imdbID);
        }

        @Override
        public int hashCode() {
            return Objects.hash(Poster, Title, Type, Year, imdbID);
        }

        @Override
        public String toString() {
            return "{" +
                    "Poster='" + Poster + '\'' +
                    ", Title='" + Title + '\'' +
                    ", Type='" + Type + '\'' +
                    ", Year='" + Year + '\'' +
                    ", imdbID='" + imdbID + '\'' +
                    '}';
        }
    }

    public static class Info {
        private int totalPages;
        private int totalRecords;

        public Info() {
        }

        public Info(int totalPages, int totalRecords) {
            this.totalPages = totalPages;
            this.totalRecords = totalRecords;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public int getTotalRecords() {
            return totalRecords;
        }

        public void setTotalRecords(int totalRecords) {
            this.totalRecords = totalRecords;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Info info = (Info) o;
            return totalPages == info.totalPages &&
                    totalRecords == info.totalRecords;
        }

        @Override
        public int hashCode() {
            return Objects.hash(totalPages, totalRecords);
        }

        @Override
        public String toString() {
            return "Info{" +
                    "totalPages=" + totalPages +
                    ", totalRecords=" + totalRecords +
                    '}';
        }
    }

    public static class Titles {
        private String page;
        private String perPage;
        private String total;
        private String total_pages;
        private Data[] data;

        public Titles() {
        }

        public Titles(String page, String perPage, String total, String total_pages, Data[] data) {
            this.page = page;
            this.perPage = perPage;
            this.total = total;
            this.total_pages = total_pages;
            this.data = data;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getPerPage() {
            return perPage;
        }

        public void setPerPage(String perPage) {
            this.perPage = perPage;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(String total_pages) {
            this.total_pages = total_pages;
        }

        public Data[] getData() {
            return data;
        }

        public void setData(Data[] data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Titles titles = (Titles) o;
            return Objects.equals(page, titles.page) &&
                    Objects.equals(perPage, titles.perPage) &&
                    Objects.equals(total, titles.total) &&
                    Objects.equals(total_pages, titles.total_pages) &&
                    Arrays.equals(data, titles.data);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(page, perPage, total, total_pages);
            result = 31 * result + Arrays.hashCode(data);
            return result;
        }

        @Override
        public String toString() {
            return "{" +
                    "page='" + page + '\'' +
                    ", perPage='" + perPage + '\'' +
                    ", total='" + total + '\'' +
                    ", total_pages='" + total_pages + '\'' +
                    ", data=" + Arrays.toString(data) +
                    '}';
        }
    }
}