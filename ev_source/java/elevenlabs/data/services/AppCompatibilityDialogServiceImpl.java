package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import io.elevenlabs.di.GlobalSharedPreferences;
import io.elevenlabs.domain.services.AppCompatibilityDialogService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/data/services/AppCompatibilityDialogServiceImpl;", "Lio/elevenlabs/domain/services/AppCompatibilityDialogService;", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "Lio/elevenlabs/domain/services/AppCompatibilityDialogService$Reason;", "reason", "", "shouldShow", "(Lio/elevenlabs/domain/services/AppCompatibilityDialogService$Reason;)Z", "Lsn/z;", "markShown", "(Lio/elevenlabs/domain/services/AppCompatibilityDialogService$Reason;)V", "Landroid/content/SharedPreferences;", "", "getPrefKey", "(Lio/elevenlabs/domain/services/AppCompatibilityDialogService$Reason;)Ljava/lang/String;", "prefKey", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AppCompatibilityDialogServiceImpl implements AppCompatibilityDialogService {
    private final SharedPreferences sharedPreferences;
    private static final Companion Companion = new Companion(null);
    private static final long COOLDOWN_MS = 2592000000L;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppCompatibilityDialogService.Reason.values().length];
            try {
                iArr[AppCompatibilityDialogService.Reason.NO_PLAY_SERVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppCompatibilityDialogService.Reason.NO_PLAY_STORE_INSTALLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppCompatibilityDialogService.Reason.NO_PLAY_STORE_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AppCompatibilityDialogServiceImpl(@GlobalSharedPreferences SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
    }

    private final String getPrefKey(AppCompatibilityDialogService.Reason reason) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[reason.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "app_compatibility_dialog_last_shown_no_play_store_account";
                }
                c6.p();
                return null;
            }
            return "app_compatibility_dialog_last_shown_no_play_store_installed";
        }
        return "app_compatibility_dialog_last_shown_no_play_services";
    }

    @Override // io.elevenlabs.domain.services.AppCompatibilityDialogService
    public void markShown(AppCompatibilityDialogService.Reason reason) {
        reason.getClass();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putLong(getPrefKey(reason), System.currentTimeMillis());
        edit.apply();
    }

    @Override // io.elevenlabs.domain.services.AppCompatibilityDialogService
    public boolean shouldShow(AppCompatibilityDialogService.Reason reason) {
        reason.getClass();
        if (System.currentTimeMillis() - this.sharedPreferences.getLong(getPrefKey(reason), 0L) >= COOLDOWN_MS) {
            return true;
        }
        return false;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/data/services/AppCompatibilityDialogServiceImpl$Companion;", "", "<init>", "()V", "COOLDOWN_MS", "", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        private Companion() {
        }
    }
}
