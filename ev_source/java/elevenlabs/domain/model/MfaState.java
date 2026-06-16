package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/domain/model/MfaState;", "", "<init>", "()V", "Totp", "PhonePending", "Phone", "Lio/elevenlabs/domain/model/MfaState$Phone;", "Lio/elevenlabs/domain/model/MfaState$PhonePending;", "Lio/elevenlabs/domain/model/MfaState$Totp;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public abstract class MfaState {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/domain/model/MfaState$Phone;", "Lio/elevenlabs/domain/model/MfaState;", "resolver", "", "verificationId", "", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "getResolver", "()Ljava/lang/Object;", "getVerificationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Phone extends MfaState {
        private final Object resolver;
        private final String verificationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(Object obj, String str) {
            super(null);
            obj.getClass();
            str.getClass();
            this.resolver = obj;
            this.verificationId = str;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, Object obj, String str, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = phone.resolver;
            }
            if ((i10 & 2) != 0) {
                str = phone.verificationId;
            }
            return phone.copy(obj, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Object getResolver() {
            return this.resolver;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVerificationId() {
            return this.verificationId;
        }

        public final Phone copy(Object resolver, String verificationId) {
            resolver.getClass();
            verificationId.getClass();
            return new Phone(resolver, verificationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            if (m.c(this.resolver, phone.resolver) && m.c(this.verificationId, phone.verificationId)) {
                return true;
            }
            return false;
        }

        public final Object getResolver() {
            return this.resolver;
        }

        public final String getVerificationId() {
            return this.verificationId;
        }

        public int hashCode() {
            return this.verificationId.hashCode() + (this.resolver.hashCode() * 31);
        }

        public String toString() {
            return "Phone(resolver=" + this.resolver + ", verificationId=" + this.verificationId + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/MfaState$PhonePending;", "Lio/elevenlabs/domain/model/MfaState;", "resolver", "", "<init>", "(Ljava/lang/Object;)V", "getResolver", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class PhonePending extends MfaState {
        private final Object resolver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhonePending(Object obj) {
            super(null);
            obj.getClass();
            this.resolver = obj;
        }

        public static /* synthetic */ PhonePending copy$default(PhonePending phonePending, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = phonePending.resolver;
            }
            return phonePending.copy(obj);
        }

        /* renamed from: component1, reason: from getter */
        public final Object getResolver() {
            return this.resolver;
        }

        public final PhonePending copy(Object resolver) {
            resolver.getClass();
            return new PhonePending(resolver);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof PhonePending) && m.c(this.resolver, ((PhonePending) other).resolver)) {
                return true;
            }
            return false;
        }

        public final Object getResolver() {
            return this.resolver;
        }

        public int hashCode() {
            return this.resolver.hashCode();
        }

        public String toString() {
            return "PhonePending(resolver=" + this.resolver + Separators.RPAREN;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/domain/model/MfaState$Totp;", "Lio/elevenlabs/domain/model/MfaState;", "resolver", "", "<init>", "(Ljava/lang/Object;)V", "getResolver", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Totp extends MfaState {
        private final Object resolver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Totp(Object obj) {
            super(null);
            obj.getClass();
            this.resolver = obj;
        }

        public static /* synthetic */ Totp copy$default(Totp totp, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = totp.resolver;
            }
            return totp.copy(obj);
        }

        /* renamed from: component1, reason: from getter */
        public final Object getResolver() {
            return this.resolver;
        }

        public final Totp copy(Object resolver) {
            resolver.getClass();
            return new Totp(resolver);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Totp) && m.c(this.resolver, ((Totp) other).resolver)) {
                return true;
            }
            return false;
        }

        public final Object getResolver() {
            return this.resolver;
        }

        public int hashCode() {
            return this.resolver.hashCode();
        }

        public String toString() {
            return "Totp(resolver=" + this.resolver + Separators.RPAREN;
        }
    }

    public /* synthetic */ MfaState(f fVar) {
        this();
    }

    private MfaState() {
    }
}
