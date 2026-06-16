package io.livekit.android.room.datastream;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lio/livekit/android/room/datastream/StreamException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "AbnormalEndException", "AlreadyOpenedException", "DecodeFailedException", "EncryptionTypeMismatch", "FileInfoUnavailableException", "IncompleteException", "LengthExceededException", "NotDirectoryException", "TerminatedException", "UnknownStreamException", "Lio/livekit/android/room/datastream/StreamException$AbnormalEndException;", "Lio/livekit/android/room/datastream/StreamException$AlreadyOpenedException;", "Lio/livekit/android/room/datastream/StreamException$DecodeFailedException;", "Lio/livekit/android/room/datastream/StreamException$EncryptionTypeMismatch;", "Lio/livekit/android/room/datastream/StreamException$FileInfoUnavailableException;", "Lio/livekit/android/room/datastream/StreamException$IncompleteException;", "Lio/livekit/android/room/datastream/StreamException$LengthExceededException;", "Lio/livekit/android/room/datastream/StreamException$NotDirectoryException;", "Lio/livekit/android/room/datastream/StreamException$TerminatedException;", "Lio/livekit/android/room/datastream/StreamException$UnknownStreamException;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class StreamException extends Exception {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$AlreadyOpenedException;", "Lio/livekit/android/room/datastream/StreamException;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class AlreadyOpenedException extends StreamException {
        /* JADX WARN: Multi-variable type inference failed */
        public AlreadyOpenedException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$DecodeFailedException;", "Lio/livekit/android/room/datastream/StreamException;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class DecodeFailedException extends StreamException {
        /* JADX WARN: Multi-variable type inference failed */
        public DecodeFailedException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$FileInfoUnavailableException;", "Lio/livekit/android/room/datastream/StreamException;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class FileInfoUnavailableException extends StreamException {
        /* JADX WARN: Multi-variable type inference failed */
        public FileInfoUnavailableException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$IncompleteException;", "Lio/livekit/android/room/datastream/StreamException;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class IncompleteException extends StreamException {
        /* JADX WARN: Multi-variable type inference failed */
        public IncompleteException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$LengthExceededException;", "Lio/livekit/android/room/datastream/StreamException;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class LengthExceededException extends StreamException {
        /* JADX WARN: Multi-variable type inference failed */
        public LengthExceededException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$NotDirectoryException;", "Lio/livekit/android/room/datastream/StreamException;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class NotDirectoryException extends StreamException {
        /* JADX WARN: Multi-variable type inference failed */
        public NotDirectoryException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$UnknownStreamException;", "Lio/livekit/android/room/datastream/StreamException;", "()V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class UnknownStreamException extends StreamException {
        /* JADX WARN: Multi-variable type inference failed */
        public UnknownStreamException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ StreamException(String str, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : str, null);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$AbnormalEndException;", "Lio/livekit/android/room/datastream/StreamException;", "message", "", "(Ljava/lang/String;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class AbnormalEndException extends StreamException {
        public /* synthetic */ AbnormalEndException(String str, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        public AbnormalEndException(String str) {
            super(str, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AbnormalEndException() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$EncryptionTypeMismatch;", "Lio/livekit/android/room/datastream/StreamException;", "message", "", "(Ljava/lang/String;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class EncryptionTypeMismatch extends StreamException {
        public /* synthetic */ EncryptionTypeMismatch(String str, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        public EncryptionTypeMismatch(String str) {
            super(str, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EncryptionTypeMismatch() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/room/datastream/StreamException$TerminatedException;", "Lio/livekit/android/room/datastream/StreamException;", "message", "", "(Ljava/lang/String;)V", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class TerminatedException extends StreamException {
        public /* synthetic */ TerminatedException(String str, int i10, f fVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        public TerminatedException(String str) {
            super(str, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TerminatedException() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    private StreamException(String str) {
        super(str);
    }

    public /* synthetic */ StreamException(String str, f fVar) {
        this(str);
    }
}
