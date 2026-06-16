package io.elevenlabs.domain.services;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService;", "", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result;", "getAppCheckToken", "(Lwn/c;)Ljava/lang/Object;", "Result", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface AppCheckTokenService {
    Object getAppCheckToken(c<? super Result> cVar);

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService$Result;", "", "<init>", "()V", "Success", "Error", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Success;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static abstract class Result {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Success;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result;", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Success extends Result {
            private final String token;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String str) {
                super(null);
                str.getClass();
                this.token = str;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = success.token;
                }
                return success.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getToken() {
                return this.token;
            }

            public final Success copy(String token) {
                token.getClass();
                return new Success(token);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Success) && m.c(this.token, ((Success) other).token)) {
                    return true;
                }
                return false;
            }

            public final String getToken() {
                return this.token;
            }

            public int hashCode() {
                return this.token.hashCode();
            }

            public String toString() {
                return f.C("Success(token=", this.token, Separators.RPAREN);
            }
        }

        public /* synthetic */ Result(kotlin.jvm.internal.f fVar) {
            this();
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result;", "<init>", "()V", "TemporalError", "NoPlayStoreInstalled", "NoPlayStoreAccount", "NoPlayServices", "FatalError", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$FatalError;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$NoPlayServices;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$NoPlayStoreAccount;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$NoPlayStoreInstalled;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$TemporalError;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static abstract class Error extends Result {

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$FatalError;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class FatalError extends Error {
                public static final FatalError INSTANCE = new FatalError();

                private FatalError() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof FatalError)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return -1389475083;
                }

                public String toString() {
                    return "FatalError";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$NoPlayServices;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class NoPlayServices extends Error {
                public static final NoPlayServices INSTANCE = new NoPlayServices();

                private NoPlayServices() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof NoPlayServices)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 1371029284;
                }

                public String toString() {
                    return "NoPlayServices";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$NoPlayStoreAccount;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class NoPlayStoreAccount extends Error {
                public static final NoPlayStoreAccount INSTANCE = new NoPlayStoreAccount();

                private NoPlayStoreAccount() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof NoPlayStoreAccount)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 281343442;
                }

                public String toString() {
                    return "NoPlayStoreAccount";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$NoPlayStoreInstalled;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class NoPlayStoreInstalled extends Error {
                public static final NoPlayStoreInstalled INSTANCE = new NoPlayStoreInstalled();

                private NoPlayStoreInstalled() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof NoPlayStoreInstalled)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 1644187103;
                }

                public String toString() {
                    return "NoPlayStoreInstalled";
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error$TemporalError;", "Lio/elevenlabs/domain/services/AppCheckTokenService$Result$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class TemporalError extends Error {
                public static final TemporalError INSTANCE = new TemporalError();

                private TemporalError() {
                    super(null);
                }

                public boolean equals(Object other) {
                    if (this == other || (other instanceof TemporalError)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return 363826901;
                }

                public String toString() {
                    return "TemporalError";
                }
            }

            private Error() {
                super(null);
            }

            public /* synthetic */ Error(kotlin.jvm.internal.f fVar) {
                this();
            }
        }

        private Result() {
        }
    }
}
