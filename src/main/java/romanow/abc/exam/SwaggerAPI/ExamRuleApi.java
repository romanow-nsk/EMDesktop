package romanow.abc.exam.SwaggerAPI;

import romanow.abc.exam.CollectionFormats.*;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import romanow.abc.exam.model.ExamRuleBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExamRuleApi {
  /**
   * Create an exam rule
   * 
   * @param body  (required)
   * @return Call&lt;ExamRuleBean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("exam-rule")
  Call<ExamRuleBean> create3(
                    @retrofit2.http.Body ExamRuleBean body    
  );

  /**
   * Get all exam rules
   * 
   * @return Call&lt;List&lt;ExamRuleBean&gt;&gt;
   */
  @GET("exam-rule")
  Call<List<ExamRuleBean>> getAll4();
    

  /**
   * Get one exam rule
   * 
   * @param id  (required)
   * @return Call&lt;ExamRuleBean&gt;
   */
  @GET("exam-rule/{id}")
  Call<ExamRuleBean> getOne4(
            @retrofit2.http.Path("id") Long id            
  );

  /**
   * Update an exam rule
   * 
   * @param body  (required)
   * @param id  (required)
   * @return Call&lt;ExamRuleBean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("exam-rule/{id}")
  Call<ExamRuleBean> update1(
                    @retrofit2.http.Body ExamRuleBean body    ,         @retrofit2.http.Path("id") Long id            
  );

}
