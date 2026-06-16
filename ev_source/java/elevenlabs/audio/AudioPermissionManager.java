package io.elevenlabs.audio;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.fragment.app.p0;
import androidx.fragment.app.s0;
import androidx.fragment.app.x;
import com.google.protobuf.c6;
import fr.n;
import ho.l;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import y5.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/audio/AudioPermissionManager;", "", "<init>", "()V", "Companion", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AudioPermissionManager {
    public static final int AUDIO_PERMISSION_REQUEST_CODE = 1001;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static l permissionCallback;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000b\u0010\u000fJ-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!R$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0017\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lio/elevenlabs/audio/AudioPermissionManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "hasAudioPermission", "(Landroid/content/Context;)Z", "Landroid/app/Activity;", "activity", "requestAudioPermission", "(Landroid/app/Activity;Lwn/c;)Ljava/lang/Object;", "Landroidx/fragment/app/x;", "fragment", "(Landroidx/fragment/app/x;Lwn/c;)Ljava/lang/Object;", "", "requestCode", "", "", "permissions", "", "grantResults", "Lsn/z;", "handlePermissionResult", "(I[Ljava/lang/String;[I)V", "isPermissionPermanentlyDenied", "(Landroid/app/Activity;)Z", "shouldShowPermissionRationale", "getPermissionRationale", "()Ljava/lang/String;", "getPermanentDenialMessage", "AUDIO_PERMISSION_REQUEST_CODE", TokenNames.I, "Lkotlin/Function1;", "permissionCallback", "Lho/l;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final String getPermanentDenialMessage() {
            return "Microphone access has been permanently denied. To enable voice conversations, please go to Settings > Apps > [App Name] > Permissions and enable Microphone access.";
        }

        public final String getPermissionRationale() {
            return "This app needs access to your microphone to enable voice conversations with AI agents. Your audio will be processed in real-time for the conversation but not stored or shared.";
        }

        public final void handlePermissionResult(int requestCode, String[] permissions, int[] grantResults) {
            boolean z6;
            permissions.getClass();
            grantResults.getClass();
            if (requestCode == 1001) {
                boolean z10 = true;
                if (grantResults.length == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 || grantResults[0] != 0) {
                    z10 = false;
                }
                l lVar = AudioPermissionManager.permissionCallback;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z10));
                }
            }
        }

        public final boolean hasAudioPermission(Context context) {
            context.getClass();
            if (c.a(context, "android.permission.RECORD_AUDIO") == 0) {
                return true;
            }
            return false;
        }

        public final boolean isPermissionPermanentlyDenied(Activity activity) {
            activity.getClass();
            if (!c.j("android.permission.RECORD_AUDIO", activity) && !hasAudioPermission(activity)) {
                return true;
            }
            return false;
        }

        public final Object requestAudioPermission(x xVar, wn.c<? super Boolean> cVar) {
            if (hasAudioPermission(xVar.J())) {
                return Boolean.TRUE;
            }
            final n nVar = new n(1, gg.b.V(cVar));
            nVar.t();
            Companion companion = AudioPermissionManager.INSTANCE;
            AudioPermissionManager.permissionCallback = new l() { // from class: io.elevenlabs.audio.AudioPermissionManager$Companion$requestAudioPermission$4$1
                public final void invoke(boolean z6) {
                    fr.l.this.resumeWith(Boolean.valueOf(z6));
                    AudioPermissionManager.permissionCallback = null;
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return z.f31622a;
                }
            };
            String[] strArr = {"android.permission.RECORD_AUDIO"};
            if (xVar.H0 != null) {
                s0 n2 = xVar.n();
                if (n2.C != null) {
                    n2.D.addLast(new p0(xVar.f2758e, AudioPermissionManager.AUDIO_PERMISSION_REQUEST_CODE));
                    n2.C.a(strArr);
                } else {
                    n2.f2712u.getClass();
                }
                return nVar.s();
            }
            c6.x(android.gov.nist.javax.sip.header.a.l("Fragment ", xVar, " not attached to Activity"));
            return null;
        }

        public final boolean shouldShowPermissionRationale(Activity activity) {
            activity.getClass();
            return c.j("android.permission.RECORD_AUDIO", activity);
        }

        private Companion() {
        }

        public final Object requestAudioPermission(Activity activity, wn.c<? super Boolean> cVar) {
            if (hasAudioPermission(activity)) {
                return Boolean.TRUE;
            }
            final n nVar = new n(1, gg.b.V(cVar));
            nVar.t();
            Companion companion = AudioPermissionManager.INSTANCE;
            AudioPermissionManager.permissionCallback = new l() { // from class: io.elevenlabs.audio.AudioPermissionManager$Companion$requestAudioPermission$2$1
                public final void invoke(boolean z6) {
                    fr.l.this.resumeWith(Boolean.valueOf(z6));
                    AudioPermissionManager.permissionCallback = null;
                }

                @Override // ho.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return z.f31622a;
                }
            };
            c.i(activity, new String[]{"android.permission.RECORD_AUDIO"}, AudioPermissionManager.AUDIO_PERMISSION_REQUEST_CODE);
            return nVar.s();
        }
    }
}
