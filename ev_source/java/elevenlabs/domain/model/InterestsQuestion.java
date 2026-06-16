package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lio/elevenlabs/domain/model/InterestsQuestion;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "title", ParameterNames.OPTIONAL, "", "answers", "", "Lio/elevenlabs/domain/model/InterestsAnswer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getKey", "()Ljava/lang/String;", "getTitle", "getOptional", "()Z", "getAnswers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class InterestsQuestion {
    private final List<InterestsAnswer> answers;
    private final String key;
    private final boolean optional;
    private final String title;

    public InterestsQuestion(String str, String str2, boolean z6, List<InterestsAnswer> list) {
        c.w(str, str2, list);
        this.key = str;
        this.title = str2;
        this.optional = z6;
        this.answers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterestsQuestion copy$default(InterestsQuestion interestsQuestion, String str, String str2, boolean z6, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = interestsQuestion.key;
        }
        if ((i10 & 2) != 0) {
            str2 = interestsQuestion.title;
        }
        if ((i10 & 4) != 0) {
            z6 = interestsQuestion.optional;
        }
        if ((i10 & 8) != 0) {
            list = interestsQuestion.answers;
        }
        return interestsQuestion.copy(str, str2, z6, list);
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

    public final List<InterestsAnswer> component4() {
        return this.answers;
    }

    public final InterestsQuestion copy(String r22, String title, boolean r42, List<InterestsAnswer> answers) {
        r22.getClass();
        title.getClass();
        answers.getClass();
        return new InterestsQuestion(r22, title, r42, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterestsQuestion)) {
            return false;
        }
        InterestsQuestion interestsQuestion = (InterestsQuestion) other;
        if (m.c(this.key, interestsQuestion.key) && m.c(this.title, interestsQuestion.title) && this.optional == interestsQuestion.optional && m.c(this.answers, interestsQuestion.answers)) {
            return true;
        }
        return false;
    }

    public final List<InterestsAnswer> getAnswers() {
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
        return this.answers.hashCode() + b.f(c.c(this.key.hashCode() * 31, 31, this.title), 31, this.optional);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.title;
        boolean z6 = this.optional;
        List<InterestsAnswer> list = this.answers;
        StringBuilder s10 = f.s("InterestsQuestion(key=", str, ", title=", str2, ", optional=");
        s10.append(z6);
        s10.append(", answers=");
        s10.append(list);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }
}
