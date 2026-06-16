package io.elevenlabs.audio;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.x;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0086@¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/app/Activity;", "", "requestAudioPermission", "(Landroid/app/Activity;Lwn/c;)Ljava/lang/Object;", "Landroidx/fragment/app/x;", "(Landroidx/fragment/app/x;Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "hasAudioPermission", "(Landroid/content/Context;)Z", "elevenlabs-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AudioPermissionManagerKt {
    public static final boolean hasAudioPermission(Context context) {
        context.getClass();
        return AudioPermissionManager.INSTANCE.hasAudioPermission(context);
    }

    public static final Object requestAudioPermission(Activity activity, c<? super Boolean> cVar) {
        return AudioPermissionManager.INSTANCE.requestAudioPermission(activity, cVar);
    }

    public static final Object requestAudioPermission(x xVar, c<? super Boolean> cVar) {
        return AudioPermissionManager.INSTANCE.requestAudioPermission(xVar, cVar);
    }
}
