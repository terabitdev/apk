package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import android.speech.SpeechRecognizer;
import com.uptodown.R;
import s5.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class TvSearchActivity extends a {
    public SpeechRecognizer l;

    @Override // s5.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_search_activity);
        if (SpeechRecognizer.isRecognitionAvailable(this)) {
            this.l = SpeechRecognizer.createSpeechRecognizer(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (this.l != null && SpeechRecognizer.isRecognitionAvailable(this)) {
            SpeechRecognizer speechRecognizer = this.l;
            speechRecognizer.getClass();
            speechRecognizer.stopListening();
            SpeechRecognizer speechRecognizer2 = this.l;
            speechRecognizer2.getClass();
            speechRecognizer2.cancel();
            SpeechRecognizer speechRecognizer3 = this.l;
            speechRecognizer3.getClass();
            speechRecognizer3.destroy();
        }
        this.l = null;
        super.onPause();
    }
}
