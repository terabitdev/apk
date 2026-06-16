package io.elevenlabs.data.api;

import a2.m;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.d;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010 ¨\u00062"}, d2 = {"Lio/elevenlabs/data/api/InterestsQuestionResponseModel;", "", "", SubscriberAttributeKt.JSON_NAME_KEY, "title", "", ParameterNames.OPTIONAL, "", "Lio/elevenlabs/data/api/InterestsAnswerResponseModel;", "answers", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/api/InterestsQuestionResponseModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)Lio/elevenlabs/data/api/InterestsQuestionResponseModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getTitle", "Z", "getOptional", "Ljava/util/List;", "getAnswers", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class InterestsQuestionResponseModel {
    private final List<InterestsAnswerResponseModel> answers;
    private final String key;
    private final boolean optional;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, sn.a.d(i.f31597b, new m(28))};

    public /* synthetic */ InterestsQuestionResponseModel(int i10, String str, String str2, boolean z6, List list, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.key = str;
            this.title = str2;
            this.optional = z6;
            this.answers = list;
            return;
        }
        t0.j(i10, 15, InterestsQuestionResponseModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(InterestsAnswerResponseModel$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterestsQuestionResponseModel copy$default(InterestsQuestionResponseModel interestsQuestionResponseModel, String str, String str2, boolean z6, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = interestsQuestionResponseModel.key;
        }
        if ((i10 & 2) != 0) {
            str2 = interestsQuestionResponseModel.title;
        }
        if ((i10 & 4) != 0) {
            z6 = interestsQuestionResponseModel.optional;
        }
        if ((i10 & 8) != 0) {
            list = interestsQuestionResponseModel.answers;
        }
        return interestsQuestionResponseModel.copy(str, str2, z6, list);
    }

    public static final /* synthetic */ void write$Self$data_release(InterestsQuestionResponseModel self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.key);
        output.V(serialDesc, 1, self.title);
        output.T(serialDesc, 2, self.optional);
        output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.answers);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOptional() {
        return this.optional;
    }

    public final List<InterestsAnswerResponseModel> component4() {
        return this.answers;
    }

    public final InterestsQuestionResponseModel copy(String r22, String title, boolean r42, List<InterestsAnswerResponseModel> answers) {
        r22.getClass();
        title.getClass();
        answers.getClass();
        return new InterestsQuestionResponseModel(r22, title, r42, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterestsQuestionResponseModel)) {
            return false;
        }
        InterestsQuestionResponseModel interestsQuestionResponseModel = (InterestsQuestionResponseModel) other;
        if (kotlin.jvm.internal.m.c(this.key, interestsQuestionResponseModel.key) && kotlin.jvm.internal.m.c(this.title, interestsQuestionResponseModel.title) && this.optional == interestsQuestionResponseModel.optional && kotlin.jvm.internal.m.c(this.answers, interestsQuestionResponseModel.answers)) {
            return true;
        }
        return false;
    }

    public final List<InterestsAnswerResponseModel> getAnswers() {
        return this.answers;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getOptional() {
        return this.optional;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.answers.hashCode() + com.google.android.gms.internal.play_billing.b.f(c.c(this.key.hashCode() * 31, 31, this.title), 31, this.optional);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.title;
        boolean z6 = this.optional;
        List<InterestsAnswerResponseModel> list = this.answers;
        StringBuilder s10 = f.s("InterestsQuestionResponseModel(key=", str, ", title=", str2, ", optional=");
        s10.append(z6);
        s10.append(", answers=");
        s10.append(list);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/api/InterestsQuestionResponseModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/api/InterestsQuestionResponseModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return InterestsQuestionResponseModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public InterestsQuestionResponseModel(String str, String str2, boolean z6, List<InterestsAnswerResponseModel> list) {
        c.w(str, str2, list);
        this.key = str;
        this.title = str2;
        this.optional = z6;
        this.answers = list;
    }
}
