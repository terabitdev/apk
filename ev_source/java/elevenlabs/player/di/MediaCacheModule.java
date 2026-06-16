package io.elevenlabs.player.di;

import android.content.Context;
import d8.v;
import java.io.File;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/player/di/MediaCacheModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ld8/v;", "provideSimpleCache", "(Landroid/content/Context;)Ld8/v;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MediaCacheModule {
    public static final MediaCacheModule INSTANCE = new MediaCacheModule();

    private MediaCacheModule() {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [d8.f, java.lang.Object] */
    public final v provideSimpleCache(Context context) {
        context.getClass();
        return new v(new File(context.getFilesDir(), "audiodata-v1/media_cache"), new Object(), new b8.a(context));
    }
}
