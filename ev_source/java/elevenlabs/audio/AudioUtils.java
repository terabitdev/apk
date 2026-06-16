package io.elevenlabs.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Build;
import f2.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import y5.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000f¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/audio/AudioUtils;", "", "<init>", "()V", "Landroid/media/AudioManager;", "audioManager", "Lsn/z;", "requestAudioFocus", "(Landroid/media/AudioManager;)V", "Landroid/content/Context;", "context", "", "hasAudioPermission", "(Landroid/content/Context;)Z", "configureAudioSession", "(Landroid/content/Context;)V", "abandonAudioFocus", "muted", "setMicrophoneMuted", "(Landroid/content/Context;Z)V", "resetAudioSession", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AudioUtils {
    public static final AudioUtils INSTANCE = new AudioUtils();

    private AudioUtils() {
    }

    private final void requestAudioFocus(android.media.AudioManager audioManager) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        if (Build.VERSION.SDK_INT >= 26) {
            audioAttributes = p.j().setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build());
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
            onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(new b(1));
            build = onAudioFocusChangeListener.build();
            audioManager.requestAudioFocus(build);
            return;
        }
        audioManager.requestAudioFocus(new b(2), 0, 1);
    }

    public final void abandonAudioFocus(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(new b(0));
        }
    }

    public final void configureAudioSession(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        audioManager.setMode(3);
        requestAudioFocus(audioManager);
    }

    public final boolean hasAudioPermission(Context context) {
        context.getClass();
        if (c.a(context, "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public final void resetAudioSession(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        ((android.media.AudioManager) systemService).setMode(0);
        abandonAudioFocus(context);
    }

    public final void setMicrophoneMuted(Context context, boolean muted) {
        context.getClass();
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        ((android.media.AudioManager) systemService).setMicrophoneMute(muted);
    }

    public static final void abandonAudioFocus$lambda$2(int i10) {
    }

    public static final void requestAudioFocus$lambda$0(int i10) {
    }

    public static final void requestAudioFocus$lambda$1(int i10) {
    }
}
