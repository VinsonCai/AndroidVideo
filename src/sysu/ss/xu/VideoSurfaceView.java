package sysu.ss.xu;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;

public class VideoSurfaceView extends TextureView {

	public VideoSurfaceView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public VideoSurfaceView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public VideoSurfaceView(Context context) {
		super(context);
		init();
	}

	private void init() {
		this.setSurfaceTextureListener(new SurfaceTextureListener() {

			@Override
			public void onSurfaceTextureUpdated(SurfaceTexture surface) {

			}

			@Override
			public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

			}

			@Override
			public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
				return false;
			}

			@Override
			public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {

			}
		});
	}
}
