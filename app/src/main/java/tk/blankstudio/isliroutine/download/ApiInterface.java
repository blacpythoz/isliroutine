package tk.blankstudio.isliroutine.download;

import android.text.format.Time;

import tk.blankstudio.isliroutine.model.Course;
import tk.blankstudio.isliroutine.model.Lession;
import tk.blankstudio.isliroutine.model.Room;
import tk.blankstudio.isliroutine.model.Teacher;
import tk.blankstudio.isliroutine.model.TimeTable;
import tk.blankstudio.isliroutine.model.YearGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by deadsec on 11/8/17.
 * All the api request calls
 */

public interface ApiInterface {

    @GET("lession/{id}")
    Call<List<Lession>> lessionList(@Path("id") String id);

    @GET("group/all")
    Call<List<YearGroup>> groupList();

    @GET("timetable/{id}")
    Call<List<TimeTable>> timeTableList(@Path("id") String id);

    @GET("room/{id}")
    Call<List<Room>> roomList(@Path("id") String id);

    @GET("teacher/{id}")
    Call<List<Teacher>> teacherList(@Path("id") String id);

    @GET("course/{id}")
    Call<List<Course>> courseList(@Path("id") String id);

}