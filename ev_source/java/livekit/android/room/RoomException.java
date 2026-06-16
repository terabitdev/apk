package io.livekit.android.room;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lio/livekit/android/room/RoomException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", ParameterNames.CAUSE, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ConnectException", "Lio/livekit/android/room/RoomException$ConnectException;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class RoomException extends Exception {
    public /* synthetic */ RoomException(String str, Throwable th, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th, null);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/RoomException$ConnectException;", "Lio/livekit/android/room/RoomException;", "message", "", ParameterNames.CAUSE, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class ConnectException extends RoomException {
        public /* synthetic */ ConnectException(String str, Throwable th, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ConnectException() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public ConnectException(String str, Throwable th) {
            super(str, th, null);
        }
    }

    public /* synthetic */ RoomException(String str, Throwable th, f fVar) {
        this(str, th);
    }

    private RoomException(String str, Throwable th) {
        super(str, th);
    }
}
