package io.elevenlabs.domain.services;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/AppCompatibilityDialogService;", "", "Lio/elevenlabs/domain/services/AppCompatibilityDialogService$Reason;", "reason", "", "shouldShow", "(Lio/elevenlabs/domain/services/AppCompatibilityDialogService$Reason;)Z", "Lsn/z;", "markShown", "(Lio/elevenlabs/domain/services/AppCompatibilityDialogService$Reason;)V", SIPHeaderNames.REASON, "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AppCompatibilityDialogService {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/domain/services/AppCompatibilityDialogService$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "NO_PLAY_SERVICES", "NO_PLAY_STORE_INSTALLED", "NO_PLAY_STORE_ACCOUNT", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Reason {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason NO_PLAY_SERVICES = new Reason("NO_PLAY_SERVICES", 0);
        public static final Reason NO_PLAY_STORE_INSTALLED = new Reason("NO_PLAY_STORE_INSTALLED", 1);
        public static final Reason NO_PLAY_STORE_ACCOUNT = new Reason("NO_PLAY_STORE_ACCOUNT", 2);

        private static final /* synthetic */ Reason[] $values() {
            return new Reason[]{NO_PLAY_SERVICES, NO_PLAY_STORE_INSTALLED, NO_PLAY_STORE_ACCOUNT};
        }

        static {
            Reason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private Reason(String str, int i10) {
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    void markShown(Reason reason);

    boolean shouldShow(Reason reason);
}
