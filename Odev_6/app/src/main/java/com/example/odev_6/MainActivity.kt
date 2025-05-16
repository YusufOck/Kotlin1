import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var postAdapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val posts = listOf(
            Post(R.drawable.profile1, "alice", R.drawable.post1, 150, "Enjoying the sunny day!"),
            Post(R.drawable.profile2, "bob", R.drawable.post2, 200, "Amazing food!"),
            Post(R.drawable.profile3, "charlie", R.drawable.post3, 350, "Sunset vibes."),
            Post(R.drawable.profile4, "diana", R.drawable.post4, 100, "Happy moments.")
        )

        postAdapter = PostAdapter(posts)
        recyclerView.adapter = postAdapter
    }
}
