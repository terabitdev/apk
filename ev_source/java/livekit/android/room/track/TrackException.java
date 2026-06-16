package io.livekit.android.room.track;

import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\b\t\n\u000b\fB\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/livekit/android/room/track/TrackException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", ParameterNames.CAUSE, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "DuplicateTrackException", "InvalidTrackStateException", "InvalidTrackTypeException", "MediaException", "PublishException", "Lio/livekit/android/room/track/TrackException$DuplicateTrackException;", "Lio/livekit/android/room/track/TrackException$InvalidTrackStateException;", "Lio/livekit/android/room/track/TrackException$InvalidTrackTypeException;", "Lio/livekit/android/room/track/TrackException$MediaException;", "Lio/livekit/android/room/track/TrackException$PublishException;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class TrackException extends Exception {
    public /* synthetic */ TrackException(String str, Throwable th, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th, null);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/TrackException$DuplicateTrackException;", "Lio/livekit/android/room/track/TrackException;", "message", "", ParameterNames.CAUSE, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DuplicateTrackException extends TrackException {
        public /* synthetic */ DuplicateTrackException(String str, Throwable th, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DuplicateTrackException() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public DuplicateTrackException(String str, Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/TrackException$InvalidTrackStateException;", "Lio/livekit/android/room/track/TrackException;", "message", "", ParameterNames.CAUSE, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class InvalidTrackStateException extends TrackException {
        public /* synthetic */ InvalidTrackStateException(String str, Throwable th, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InvalidTrackStateException() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public InvalidTrackStateException(String str, Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/TrackException$InvalidTrackTypeException;", "Lio/livekit/android/room/track/TrackException;", "message", "", ParameterNames.CAUSE, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class InvalidTrackTypeException extends TrackException {
        public /* synthetic */ InvalidTrackTypeException(String str, Throwable th, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InvalidTrackTypeException() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public InvalidTrackTypeException(String str, Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/TrackException$MediaException;", "Lio/livekit/android/room/track/TrackException;", "message", "", ParameterNames.CAUSE, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class MediaException extends TrackException {
        public /* synthetic */ MediaException(String str, Throwable th, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MediaException() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public MediaException(String str, Throwable th) {
            super(str, th, null);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/track/TrackException$PublishException;", "Lio/livekit/android/room/track/TrackException;", "message", "", ParameterNames.CAUSE, "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class PublishException extends TrackException {
        public /* synthetic */ PublishException(String str, Throwable th, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PublishException() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public PublishException(String str, Throwable th) {
            super(str, th, null);
        }
    }

    public /* synthetic */ TrackException(String str, Throwable th, f fVar) {
        this(str, th);
    }

    private TrackException(String str, Throwable th) {
        super(str, th);
    }
}
