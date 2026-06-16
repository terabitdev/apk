package io.elevenlabs.domain.usecase;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult;", "", "<init>", "()V", "Success", "Error", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Success;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class VerifyPhoneNumberResult {
    public /* synthetic */ VerifyPhoneNumberResult(f fVar) {
        this();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult;", "<init>", "()V", "InvalidCredentials", "TooManyAttempts", "NoPhoneNumberAvailable", "Unknown", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error$InvalidCredentials;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error$NoPhoneNumberAvailable;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error$TooManyAttempts;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error$Unknown;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static abstract class Error extends VerifyPhoneNumberResult {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error$InvalidCredentials;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class InvalidCredentials extends Error {
            public static final InvalidCredentials INSTANCE = new InvalidCredentials();

            private InvalidCredentials() {
                super(null);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof InvalidCredentials)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 880717600;
            }

            public String toString() {
                return "InvalidCredentials";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error$NoPhoneNumberAvailable;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class NoPhoneNumberAvailable extends Error {
            public static final NoPhoneNumberAvailable INSTANCE = new NoPhoneNumberAvailable();

            private NoPhoneNumberAvailable() {
                super(null);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof NoPhoneNumberAvailable)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2044814674;
            }

            public String toString() {
                return "NoPhoneNumberAvailable";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error$TooManyAttempts;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class TooManyAttempts extends Error {
            public static final TooManyAttempts INSTANCE = new TooManyAttempts();

            private TooManyAttempts() {
                super(null);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof TooManyAttempts)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1601565054;
            }

            public String toString() {
                return "TooManyAttempts";
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error$Unknown;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Unknown extends Error {
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super(null);
            }

            public boolean equals(Object other) {
                if (this == other || (other instanceof Unknown)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1885198479;
            }

            public String toString() {
                return "Unknown";
            }
        }

        private Error() {
            super(null);
        }

        public /* synthetic */ Error(f fVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Success;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult;", "<init>", "()V", "CodeSent", "AutoVerified", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Success$AutoVerified;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Success$CodeSent;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static abstract class Success extends VerifyPhoneNumberResult {

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Success$AutoVerified;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Success;", "credential", "", "resolver", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getCredential", "()Ljava/lang/Object;", "getResolver", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class AutoVerified extends Success {
            private final Object credential;
            private final Object resolver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoVerified(Object obj, Object obj2) {
                super(null);
                obj.getClass();
                obj2.getClass();
                this.credential = obj;
                this.resolver = obj2;
            }

            public static /* synthetic */ AutoVerified copy$default(AutoVerified autoVerified, Object obj, Object obj2, int i10, Object obj3) {
                if ((i10 & 1) != 0) {
                    obj = autoVerified.credential;
                }
                if ((i10 & 2) != 0) {
                    obj2 = autoVerified.resolver;
                }
                return autoVerified.copy(obj, obj2);
            }

            /* renamed from: component1, reason: from getter */
            public final Object getCredential() {
                return this.credential;
            }

            /* renamed from: component2, reason: from getter */
            public final Object getResolver() {
                return this.resolver;
            }

            public final AutoVerified copy(Object credential, Object resolver) {
                credential.getClass();
                resolver.getClass();
                return new AutoVerified(credential, resolver);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AutoVerified)) {
                    return false;
                }
                AutoVerified autoVerified = (AutoVerified) other;
                if (m.c(this.credential, autoVerified.credential) && m.c(this.resolver, autoVerified.resolver)) {
                    return true;
                }
                return false;
            }

            public final Object getCredential() {
                return this.credential;
            }

            public final Object getResolver() {
                return this.resolver;
            }

            public int hashCode() {
                return this.resolver.hashCode() + (this.credential.hashCode() * 31);
            }

            public String toString() {
                return "AutoVerified(credential=" + this.credential + ", resolver=" + this.resolver + Separators.RPAREN;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Success$CodeSent;", "Lio/elevenlabs/domain/usecase/VerifyPhoneNumberResult$Success;", "verificationId", "", "resolver", "", "forceResendingToken", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getVerificationId", "()Ljava/lang/String;", "getResolver", "()Ljava/lang/Object;", "getForceResendingToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class CodeSent extends Success {
            private final Object forceResendingToken;
            private final Object resolver;
            private final String verificationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CodeSent(String str, Object obj, Object obj2) {
                super(null);
                str.getClass();
                obj.getClass();
                obj2.getClass();
                this.verificationId = str;
                this.resolver = obj;
                this.forceResendingToken = obj2;
            }

            public static /* synthetic */ CodeSent copy$default(CodeSent codeSent, String str, Object obj, Object obj2, int i10, Object obj3) {
                if ((i10 & 1) != 0) {
                    str = codeSent.verificationId;
                }
                if ((i10 & 2) != 0) {
                    obj = codeSent.resolver;
                }
                if ((i10 & 4) != 0) {
                    obj2 = codeSent.forceResendingToken;
                }
                return codeSent.copy(str, obj, obj2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getVerificationId() {
                return this.verificationId;
            }

            /* renamed from: component2, reason: from getter */
            public final Object getResolver() {
                return this.resolver;
            }

            /* renamed from: component3, reason: from getter */
            public final Object getForceResendingToken() {
                return this.forceResendingToken;
            }

            public final CodeSent copy(String verificationId, Object resolver, Object forceResendingToken) {
                verificationId.getClass();
                resolver.getClass();
                forceResendingToken.getClass();
                return new CodeSent(verificationId, resolver, forceResendingToken);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CodeSent)) {
                    return false;
                }
                CodeSent codeSent = (CodeSent) other;
                if (m.c(this.verificationId, codeSent.verificationId) && m.c(this.resolver, codeSent.resolver) && m.c(this.forceResendingToken, codeSent.forceResendingToken)) {
                    return true;
                }
                return false;
            }

            public final Object getForceResendingToken() {
                return this.forceResendingToken;
            }

            public final Object getResolver() {
                return this.resolver;
            }

            public final String getVerificationId() {
                return this.verificationId;
            }

            public int hashCode() {
                return this.forceResendingToken.hashCode() + ((this.resolver.hashCode() + (this.verificationId.hashCode() * 31)) * 31);
            }

            public String toString() {
                return "CodeSent(verificationId=" + this.verificationId + ", resolver=" + this.resolver + ", forceResendingToken=" + this.forceResendingToken + Separators.RPAREN;
            }
        }

        private Success() {
            super(null);
        }

        public /* synthetic */ Success(f fVar) {
            this();
        }
    }

    private VerifyPhoneNumberResult() {
    }
}
