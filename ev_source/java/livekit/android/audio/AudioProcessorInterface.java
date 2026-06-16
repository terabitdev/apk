package io.livekit.android.audio;

import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/livekit/android/audio/AudioProcessorInterface;", "", "", Constants.ENABLE_DISABLE, "()Z", "", "getName", "()Ljava/lang/String;", "", "sampleRateHz", "numChannels", "Lsn/z;", "initializeAudioProcessing", "(II)V", "newRate", "resetAudioProcessing", "(I)V", "numBands", "numFrames", "Ljava/nio/ByteBuffer;", "buffer", "processAudio", "(IILjava/nio/ByteBuffer;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface AudioProcessorInterface {
    String getName();

    void initializeAudioProcessing(int sampleRateHz, int numChannels);

    boolean isEnabled();

    void processAudio(int numBands, int numFrames, ByteBuffer buffer);

    void resetAudioProcessing(int newRate);
}
