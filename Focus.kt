package prachi.raval.mymind
import android.media.MediaPlayer
import android.net.Uri
import android.view.View
import android.widget.ImageButton
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Focus : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var playButton: ImageButton
    private lateinit var pauseButton: ImageButton
    private lateinit var stopButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_focus)
        playButton = findViewById(R.id.button_1)
        pauseButton = findViewById(R.id.button_3)
        stopButton = findViewById(R.id.button_2)
        mediaPlayer = MediaPlayer.create(this, R.raw.focus)
        mediaPlayer.setOnCompletionListener {
            // Reset the media player to its initial state when playback is complete
            stopAudio()
        }

        playButton.setOnClickListener {
            if (!mediaPlayer.isPlaying) {
                mediaPlayer.start()
            }
        }

        pauseButton.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            }
        }

        stopButton.setOnClickListener {
            stopAudio()
        }

        val backButton: ImageButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            // Handle back button intent
            onBackPressed()
        }
    }

    private fun stopAudio() {
        mediaPlayer.pause()
        mediaPlayer.seekTo(0)
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}
