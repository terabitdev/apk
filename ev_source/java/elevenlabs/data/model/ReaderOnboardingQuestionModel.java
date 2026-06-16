package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import p.n;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.d;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#JJ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001fR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00108\u0012\u0004\b:\u0010/\u001a\u0004\b9\u0010#¨\u0006="}, d2 = {"Lio/elevenlabs/data/model/ReaderOnboardingQuestionModel;", "", "", SubscriberAttributeKt.JSON_NAME_KEY, "title", "", ParameterNames.OPTIONAL, "", "Lio/elevenlabs/data/model/ReaderOnboardingAnswerModel;", "answers", "singleSelection", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/ReaderOnboardingQuestionModel;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;)Lio/elevenlabs/data/model/ReaderOnboardingQuestionModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getKey$annotations", "()V", "getTitle", "getTitle$annotations", "Z", "getOptional", "getOptional$annotations", "Ljava/util/List;", "getAnswers", "getAnswers$annotations", "Ljava/lang/Boolean;", "getSingleSelection", "getSingleSelection$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReaderOnboardingQuestionModel {
    private final List<ReaderOnboardingAnswerModel> answers;
    private final String key;
    private final boolean optional;
    private final Boolean singleSelection;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, sn.a.d(i.f31597b, new io.elevenlabs.data.database.entities.reads.a(20)), null};

    public /* synthetic */ ReaderOnboardingQuestionModel(int i10, String str, String str2, boolean z6, List list, Boolean bool, c1 c1Var) {
        if (15 == (i10 & 15)) {
            this.key = str;
            this.title = str2;
            this.optional = z6;
            this.answers = list;
            if ((i10 & 16) == 0) {
                this.singleSelection = null;
                return;
            } else {
                this.singleSelection = bool;
                return;
            }
        }
        t0.j(i10, 15, ReaderOnboardingQuestionModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ReaderOnboardingAnswerModel$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ ReaderOnboardingQuestionModel copy$default(ReaderOnboardingQuestionModel readerOnboardingQuestionModel, String str, String str2, boolean z6, List list, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = readerOnboardingQuestionModel.key;
        }
        if ((i10 & 2) != 0) {
            str2 = readerOnboardingQuestionModel.title;
        }
        if ((i10 & 4) != 0) {
            z6 = readerOnboardingQuestionModel.optional;
        }
        if ((i10 & 8) != 0) {
            list = readerOnboardingQuestionModel.answers;
        }
        if ((i10 & 16) != 0) {
            bool = readerOnboardingQuestionModel.singleSelection;
        }
        Boolean bool2 = bool;
        boolean z10 = z6;
        return readerOnboardingQuestionModel.copy(str, str2, z10, list, bool2);
    }

    public static final /* synthetic */ void write$Self$data_release(ReaderOnboardingQuestionModel self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        output.V(serialDesc, 0, self.key);
        output.V(serialDesc, 1, self.title);
        output.T(serialDesc, 2, self.optional);
        output.g(serialDesc, 3, (KSerializer) hVarArr[3].getValue(), self.answers);
        if (output.C(serialDesc) || self.singleSelection != null) {
            output.o(serialDesc, 4, ur.g.f34583a, self.singleSelection);
        }
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

    public final List<ReaderOnboardingAnswerModel> component4() {
        return this.answers;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getSingleSelection() {
        return this.singleSelection;
    }

    public final ReaderOnboardingQuestionModel copy(String r72, String title, boolean r92, List<ReaderOnboardingAnswerModel> answers, Boolean singleSelection) {
        r72.getClass();
        title.getClass();
        answers.getClass();
        return new ReaderOnboardingQuestionModel(r72, title, r92, answers, singleSelection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderOnboardingQuestionModel)) {
            return false;
        }
        ReaderOnboardingQuestionModel readerOnboardingQuestionModel = (ReaderOnboardingQuestionModel) other;
        if (m.c(this.key, readerOnboardingQuestionModel.key) && m.c(this.title, readerOnboardingQuestionModel.title) && this.optional == readerOnboardingQuestionModel.optional && m.c(this.answers, readerOnboardingQuestionModel.answers) && m.c(this.singleSelection, readerOnboardingQuestionModel.singleSelection)) {
            return true;
        }
        return false;
    }

    public final List<ReaderOnboardingAnswerModel> getAnswers() {
        return this.answers;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getOptional() {
        return this.optional;
    }

    public final Boolean getSingleSelection() {
        return this.singleSelection;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int d10 = n.d(com.google.android.gms.internal.play_billing.b.f(c.c(this.key.hashCode() * 31, 31, this.title), 31, this.optional), 31, this.answers);
        Boolean bool = this.singleSelection;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return d10 + hashCode;
    }

    public String toString() {
        String str = this.key;
        String str2 = this.title;
        boolean z6 = this.optional;
        List<ReaderOnboardingAnswerModel> list = this.answers;
        Boolean bool = this.singleSelection;
        StringBuilder s10 = f.s("ReaderOnboardingQuestionModel(key=", str, ", title=", str2, ", optional=");
        s10.append(z6);
        s10.append(", answers=");
        s10.append(list);
        s10.append(", singleSelection=");
        s10.append(bool);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/ReaderOnboardingQuestionModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/ReaderOnboardingQuestionModel;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReaderOnboardingQuestionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getAnswers$annotations() {
    }

    public static /* synthetic */ void getKey$annotations() {
    }

    public static /* synthetic */ void getOptional$annotations() {
    }

    public static /* synthetic */ void getSingleSelection$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public ReaderOnboardingQuestionModel(String str, String str2, boolean z6, List<ReaderOnboardingAnswerModel> list, Boolean bool) {
        c.w(str, str2, list);
        this.key = str;
        this.title = str2;
        this.optional = z6;
        this.answers = list;
        this.singleSelection = bool;
    }

    public /* synthetic */ ReaderOnboardingQuestionModel(String str, String str2, boolean z6, List list, Boolean bool, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, z6, list, (i10 & 16) != 0 ? null : bool);
    }
}
