package io.elevenlabs.data.model;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import qr.g;
import sn.h;
import sn.i;
import tr.b;
import ur.c1;
import ur.d;
import ur.l0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001cR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001e¨\u00065"}, d2 = {"Lio/elevenlabs/data/model/ReaderOnboardingSurveyModelOutput;", "", "", "showPaywall", "", "birthdayUnix", "", "Lio/elevenlabs/data/model/ReaderOnboardingQuestionModel;", "questions", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;)V", "", "seen0", "Lur/c1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;Lur/c1;)V", "self", "Ltr/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lsn/z;", "write$Self$data_release", "(Lio/elevenlabs/data/model/ReaderOnboardingSurveyModelOutput;Ltr/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;)Lio/elevenlabs/data/model/ReaderOnboardingSurveyModelOutput;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getShowPaywall", "getShowPaywall$annotations", "()V", "Ljava/lang/Long;", "getBirthdayUnix", "getBirthdayUnix$annotations", "Ljava/util/List;", "getQuestions", "getQuestions$annotations", "Companion", "$serializer", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@g
/* loaded from: classes3.dex */
public final /* data */ class ReaderOnboardingSurveyModelOutput {
    private final Long birthdayUnix;
    private final List<ReaderOnboardingQuestionModel> questions;
    private final Boolean showPaywall;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final h[] $childSerializers = {null, null, sn.a.d(i.f31597b, new io.elevenlabs.data.database.entities.reads.a(21))};

    public /* synthetic */ ReaderOnboardingSurveyModelOutput(int i10, Boolean bool, Long l4, List list, c1 c1Var) {
        if ((i10 & 1) == 0) {
            this.showPaywall = null;
        } else {
            this.showPaywall = bool;
        }
        if ((i10 & 2) == 0) {
            this.birthdayUnix = null;
        } else {
            this.birthdayUnix = l4;
        }
        if ((i10 & 4) == 0) {
            this.questions = null;
        } else {
            this.questions = list;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ReaderOnboardingQuestionModel$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReaderOnboardingSurveyModelOutput copy$default(ReaderOnboardingSurveyModelOutput readerOnboardingSurveyModelOutput, Boolean bool, Long l4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = readerOnboardingSurveyModelOutput.showPaywall;
        }
        if ((i10 & 2) != 0) {
            l4 = readerOnboardingSurveyModelOutput.birthdayUnix;
        }
        if ((i10 & 4) != 0) {
            list = readerOnboardingSurveyModelOutput.questions;
        }
        return readerOnboardingSurveyModelOutput.copy(bool, l4, list);
    }

    public static final /* synthetic */ void write$Self$data_release(ReaderOnboardingSurveyModelOutput self, b output, SerialDescriptor serialDesc) {
        h[] hVarArr = $childSerializers;
        if (output.C(serialDesc) || self.showPaywall != null) {
            output.o(serialDesc, 0, ur.g.f34583a, self.showPaywall);
        }
        if (output.C(serialDesc) || self.birthdayUnix != null) {
            output.o(serialDesc, 1, l0.f34611a, self.birthdayUnix);
        }
        if (output.C(serialDesc) || self.questions != null) {
            output.o(serialDesc, 2, (KSerializer) hVarArr[2].getValue(), self.questions);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getShowPaywall() {
        return this.showPaywall;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getBirthdayUnix() {
        return this.birthdayUnix;
    }

    public final List<ReaderOnboardingQuestionModel> component3() {
        return this.questions;
    }

    public final ReaderOnboardingSurveyModelOutput copy(Boolean showPaywall, Long birthdayUnix, List<ReaderOnboardingQuestionModel> questions) {
        return new ReaderOnboardingSurveyModelOutput(showPaywall, birthdayUnix, questions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReaderOnboardingSurveyModelOutput)) {
            return false;
        }
        ReaderOnboardingSurveyModelOutput readerOnboardingSurveyModelOutput = (ReaderOnboardingSurveyModelOutput) other;
        if (m.c(this.showPaywall, readerOnboardingSurveyModelOutput.showPaywall) && m.c(this.birthdayUnix, readerOnboardingSurveyModelOutput.birthdayUnix) && m.c(this.questions, readerOnboardingSurveyModelOutput.questions)) {
            return true;
        }
        return false;
    }

    public final Long getBirthdayUnix() {
        return this.birthdayUnix;
    }

    public final List<ReaderOnboardingQuestionModel> getQuestions() {
        return this.questions;
    }

    public final Boolean getShowPaywall() {
        return this.showPaywall;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Boolean bool = this.showPaywall;
        int i10 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i11 = hashCode * 31;
        Long l4 = this.birthdayUnix;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        List<ReaderOnboardingQuestionModel> list = this.questions;
        if (list != null) {
            i10 = list.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        Boolean bool = this.showPaywall;
        Long l4 = this.birthdayUnix;
        List<ReaderOnboardingQuestionModel> list = this.questions;
        StringBuilder sb = new StringBuilder("ReaderOnboardingSurveyModelOutput(showPaywall=");
        sb.append(bool);
        sb.append(", birthdayUnix=");
        sb.append(l4);
        sb.append(", questions=");
        return z.h.e(sb, list, Separators.RPAREN);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/elevenlabs/data/model/ReaderOnboardingSurveyModelOutput$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/elevenlabs/data/model/ReaderOnboardingSurveyModelOutput;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ReaderOnboardingSurveyModelOutput$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBirthdayUnix$annotations() {
    }

    public static /* synthetic */ void getQuestions$annotations() {
    }

    public static /* synthetic */ void getShowPaywall$annotations() {
    }

    public ReaderOnboardingSurveyModelOutput() {
        this((Boolean) null, (Long) null, (List) null, 7, (f) null);
    }

    public ReaderOnboardingSurveyModelOutput(Boolean bool, Long l4, List<ReaderOnboardingQuestionModel> list) {
        this.showPaywall = bool;
        this.birthdayUnix = l4;
        this.questions = list;
    }

    public /* synthetic */ ReaderOnboardingSurveyModelOutput(Boolean bool, Long l4, List list, int i10, f fVar) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : l4, (i10 & 4) != 0 ? null : list);
    }
}
