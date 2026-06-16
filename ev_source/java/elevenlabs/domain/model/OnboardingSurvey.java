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
import p.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/domain/model/OnboardingSurvey;", "", "birthdayUnix", "", "questions", "", "Lio/elevenlabs/domain/model/OnboardingSurvey$Question;", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "getBirthdayUnix", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQuestions", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lio/elevenlabs/domain/model/OnboardingSurvey;", "equals", "", "other", "hashCode", "", "toString", "", "Question", "Answer", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class OnboardingSurvey {
    private final Long birthdayUnix;
    private final List<Question> questions;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/domain/model/OnboardingSurvey$Answer;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "title", "selected", "", ParameterNames.ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getTitle", "getSelected", "()Z", "getIcon", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Answer {
        private final String icon;
        private final String key;
        private final boolean selected;
        private final String title;

        public Answer(String str, String str2, boolean z6, String str3) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.title = str2;
            this.selected = z6;
            this.icon = str3;
        }

        public static /* synthetic */ Answer copy$default(Answer answer, String str, String str2, boolean z6, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = answer.key;
            }
            if ((i10 & 2) != 0) {
                str2 = answer.title;
            }
            if ((i10 & 4) != 0) {
                z6 = answer.selected;
            }
            if ((i10 & 8) != 0) {
                str3 = answer.icon;
            }
            return answer.copy(str, str2, z6, str3);
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
        public final boolean getSelected() {
            return this.selected;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        public final Answer copy(String key, String title, boolean selected, String icon) {
            key.getClass();
            title.getClass();
            return new Answer(key, title, selected, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) other;
            if (m.c(this.key, answer.key) && m.c(this.title, answer.title) && this.selected == answer.selected && m.c(this.icon, answer.icon)) {
                return true;
            }
            return false;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getKey() {
            return this.key;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            int f10 = b.f(c.c(this.key.hashCode() * 31, 31, this.title), 31, this.selected);
            String str = this.icon;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return f10 + hashCode;
        }

        public String toString() {
            String str = this.key;
            String str2 = this.title;
            boolean z6 = this.selected;
            String str3 = this.icon;
            StringBuilder s10 = f.s("Answer(key=", str, ", title=", str2, ", selected=");
            s10.append(z6);
            s10.append(", icon=");
            s10.append(str3);
            s10.append(Separators.RPAREN);
            return s10.toString();
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006 "}, d2 = {"Lio/elevenlabs/domain/model/OnboardingSurvey$Question;", "", SubscriberAttributeKt.JSON_NAME_KEY, "", "title", ParameterNames.OPTIONAL, "", "answers", "", "Lio/elevenlabs/domain/model/OnboardingSurvey$Answer;", "singleSelection", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Z)V", "getKey", "()Ljava/lang/String;", "getTitle", "getOptional", "()Z", "getAnswers", "()Ljava/util/List;", "getSingleSelection", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Question {
        private final List<Answer> answers;
        private final String key;
        private final boolean optional;
        private final boolean singleSelection;
        private final String title;

        public Question(String str, String str2, boolean z6, List<Answer> list, boolean z10) {
            c.w(str, str2, list);
            this.key = str;
            this.title = str2;
            this.optional = z6;
            this.answers = list;
            this.singleSelection = z10;
        }

        public static /* synthetic */ Question copy$default(Question question, String str, String str2, boolean z6, List list, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = question.key;
            }
            if ((i10 & 2) != 0) {
                str2 = question.title;
            }
            if ((i10 & 4) != 0) {
                z6 = question.optional;
            }
            if ((i10 & 8) != 0) {
                list = question.answers;
            }
            if ((i10 & 16) != 0) {
                z10 = question.singleSelection;
            }
            boolean z11 = z10;
            boolean z12 = z6;
            return question.copy(str, str2, z12, list, z11);
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

        public final List<Answer> component4() {
            return this.answers;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSingleSelection() {
            return this.singleSelection;
        }

        public final Question copy(String key, String title, boolean optional, List<Answer> answers, boolean singleSelection) {
            key.getClass();
            title.getClass();
            answers.getClass();
            return new Question(key, title, optional, answers, singleSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Question)) {
                return false;
            }
            Question question = (Question) other;
            if (m.c(this.key, question.key) && m.c(this.title, question.title) && this.optional == question.optional && m.c(this.answers, question.answers) && this.singleSelection == question.singleSelection) {
                return true;
            }
            return false;
        }

        public final List<Answer> getAnswers() {
            return this.answers;
        }

        public final String getKey() {
            return this.key;
        }

        public final boolean getOptional() {
            return this.optional;
        }

        public final boolean getSingleSelection() {
            return this.singleSelection;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.singleSelection) + n.d(b.f(c.c(this.key.hashCode() * 31, 31, this.title), 31, this.optional), 31, this.answers);
        }

        public String toString() {
            String str = this.key;
            String str2 = this.title;
            boolean z6 = this.optional;
            List<Answer> list = this.answers;
            boolean z10 = this.singleSelection;
            StringBuilder s10 = f.s("Question(key=", str, ", title=", str2, ", optional=");
            s10.append(z6);
            s10.append(", answers=");
            s10.append(list);
            s10.append(", singleSelection=");
            return n.j(Separators.RPAREN, s10, z10);
        }
    }

    public OnboardingSurvey(Long l4, List<Question> list) {
        list.getClass();
        this.birthdayUnix = l4;
        this.questions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingSurvey copy$default(OnboardingSurvey onboardingSurvey, Long l4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l4 = onboardingSurvey.birthdayUnix;
        }
        if ((i10 & 2) != 0) {
            list = onboardingSurvey.questions;
        }
        return onboardingSurvey.copy(l4, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getBirthdayUnix() {
        return this.birthdayUnix;
    }

    public final List<Question> component2() {
        return this.questions;
    }

    public final OnboardingSurvey copy(Long birthdayUnix, List<Question> questions) {
        questions.getClass();
        return new OnboardingSurvey(birthdayUnix, questions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingSurvey)) {
            return false;
        }
        OnboardingSurvey onboardingSurvey = (OnboardingSurvey) other;
        if (m.c(this.birthdayUnix, onboardingSurvey.birthdayUnix) && m.c(this.questions, onboardingSurvey.questions)) {
            return true;
        }
        return false;
    }

    public final Long getBirthdayUnix() {
        return this.birthdayUnix;
    }

    public final List<Question> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        int hashCode;
        Long l4 = this.birthdayUnix;
        if (l4 == null) {
            hashCode = 0;
        } else {
            hashCode = l4.hashCode();
        }
        return this.questions.hashCode() + (hashCode * 31);
    }

    public String toString() {
        return "OnboardingSurvey(birthdayUnix=" + this.birthdayUnix + ", questions=" + this.questions + Separators.RPAREN;
    }
}
