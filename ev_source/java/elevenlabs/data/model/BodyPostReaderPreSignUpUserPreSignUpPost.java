package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import io.elevenlabs.data.model.response.AccountMetadataResponseModel;
import io.elevenlabs.data.model.response.AccountMetadataResponseModel$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import tr.b;
import ur.c1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u0018¨\u00060"}, d2 = {"Lio/elevenlabs/data/model/BodyPostReaderPreSignUpUserPreSignUpPost;", "", "", "email", "Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;", "accountMetadata", "recaptchaToken", "<init>", "(Ljava/lang/String;Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;Ljava/lang/String;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;Ljava/lang/String;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/BodyPostReaderPreSignUpUserPreSignUpPost;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;", "component3", "copy", "(Ljava/lang/String;Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;Ljava/lang/String;)Lio/elevenlabs/data/model/BodyPostReaderPreSignUpUserPreSignUpPost;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "Lio/elevenlabs/data/model/response/AccountMetadataResponseModel;", "getAccountMetadata", "getAccountMetadata$annotations", "getRecaptchaToken", "getRecaptchaToken$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class BodyPostReaderPreSignUpUserPreSignUpPost {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AccountMetadataResponseModel accountMetadata;
    private final String email;
    private final String recaptchaToken;

    public /* synthetic */ BodyPostReaderPreSignUpUserPreSignUpPost(int i10, String str, AccountMetadataResponseModel accountMetadataResponseModel, String str2, c1 c1Var) {
        if (7 == (i10 & 7)) {
            this.email = str;
            this.accountMetadata = accountMetadataResponseModel;
            this.recaptchaToken = str2;
            return;
        }
        t0.j(i10, 7, BodyPostReaderPreSignUpUserPreSignUpPost$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static /* synthetic */ BodyPostReaderPreSignUpUserPreSignUpPost copy$default(BodyPostReaderPreSignUpUserPreSignUpPost bodyPostReaderPreSignUpUserPreSignUpPost, String str, AccountMetadataResponseModel accountMetadataResponseModel, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bodyPostReaderPreSignUpUserPreSignUpPost.email;
        }
        if ((i10 & 2) != 0) {
            accountMetadataResponseModel = bodyPostReaderPreSignUpUserPreSignUpPost.accountMetadata;
        }
        if ((i10 & 4) != 0) {
            str2 = bodyPostReaderPreSignUpUserPreSignUpPost.recaptchaToken;
        }
        return bodyPostReaderPreSignUpUserPreSignUpPost.copy(str, accountMetadataResponseModel, str2);
    }

    public static final /* synthetic */ void write$Self$data_release(BodyPostReaderPreSignUpUserPreSignUpPost self, b output, SerialDescriptor serialDesc) {
        output.V(serialDesc, 0, self.email);
        output.g(serialDesc, 1, AccountMetadataResponseModel$$serializer.INSTANCE, self.accountMetadata);
        output.V(serialDesc, 2, self.recaptchaToken);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountMetadataResponseModel getAccountMetadata() {
        return this.accountMetadata;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRecaptchaToken() {
        return this.recaptchaToken;
    }

    public final BodyPostReaderPreSignUpUserPreSignUpPost copy(String email, AccountMetadataResponseModel accountMetadata, String recaptchaToken) {
        email.getClass();
        accountMetadata.getClass();
        recaptchaToken.getClass();
        return new BodyPostReaderPreSignUpUserPreSignUpPost(email, accountMetadata, recaptchaToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyPostReaderPreSignUpUserPreSignUpPost)) {
            return false;
        }
        BodyPostReaderPreSignUpUserPreSignUpPost bodyPostReaderPreSignUpUserPreSignUpPost = (BodyPostReaderPreSignUpUserPreSignUpPost) other;
        if (m.c(this.email, bodyPostReaderPreSignUpUserPreSignUpPost.email) && m.c(this.accountMetadata, bodyPostReaderPreSignUpUserPreSignUpPost.accountMetadata) && m.c(this.recaptchaToken, bodyPostReaderPreSignUpUserPreSignUpPost.recaptchaToken)) {
            return true;
        }
        return false;
    }

    public final AccountMetadataResponseModel getAccountMetadata() {
        return this.accountMetadata;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRecaptchaToken() {
        return this.recaptchaToken;
    }

    public int hashCode() {
        return this.recaptchaToken.hashCode() + ((this.accountMetadata.hashCode() + (this.email.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.email;
        AccountMetadataResponseModel accountMetadataResponseModel = this.accountMetadata;
        String str2 = this.recaptchaToken;
        StringBuilder sb = new StringBuilder("BodyPostReaderPreSignUpUserPreSignUpPost(email=");
        sb.append(str);
        sb.append(", accountMetadata=");
        sb.append(accountMetadataResponseModel);
        sb.append(", recaptchaToken=");
        return f.l(str2, Separators.RPAREN, sb);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/BodyPostReaderPreSignUpUserPreSignUpPost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/BodyPostReaderPreSignUpUserPreSignUpPost;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return BodyPostReaderPreSignUpUserPreSignUpPost$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAccountMetadata$annotations() {
    }

    public static /* synthetic */ void getEmail$annotations() {
    }

    public static /* synthetic */ void getRecaptchaToken$annotations() {
    }

    public BodyPostReaderPreSignUpUserPreSignUpPost(String str, AccountMetadataResponseModel accountMetadataResponseModel, String str2) {
        str.getClass();
        accountMetadataResponseModel.getClass();
        str2.getClass();
        this.email = str;
        this.accountMetadata = accountMetadataResponseModel;
        this.recaptchaToken = str2;
    }
}
