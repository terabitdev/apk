package io.elevenlabs.readerapp.core;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import io.elevenlabs.domain.Analytics;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/core/Survey;", "", "questions", "", "Lio/elevenlabs/readerapp/core/Survey$Question;", "<init>", "(Ljava/util/List;)V", "getQuestions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Question", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class Survey {
    public static final int $stable = 8;
    private final List<Question> questions;

    public Survey(List<Question> list) {
        list.getClass();
        this.questions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Survey copy$default(Survey survey, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = survey.questions;
        }
        return survey.copy(list);
    }

    public final List<Question> component1() {
        return this.questions;
    }

    public final Survey copy(List<Question> questions) {
        questions.getClass();
        return new Survey(questions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof Survey) && kotlin.jvm.internal.m.c(this.questions, ((Survey) other).questions)) {
            return true;
        }
        return false;
    }

    public final List<Question> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        return this.questions.hashCode();
    }

    public String toString() {
        return ib.i.k("Survey(questions=", Separators.RPAREN, this.questions);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/elevenlabs/readerapp/core/Survey$Question;", "", "type", "Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType;", "question", "", "<init>", "(Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType;Ljava/lang/String;)V", "getType", "()Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType;", "getQuestion", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "QuestionType", "Choice", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class Question {
        public static final int $stable = 0;
        private final String question;
        private final QuestionType type;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/elevenlabs/readerapp/core/Survey$Question$Choice;", "", ParameterNames.TEXT, "", "analyticsEvent", "Lio/elevenlabs/domain/Analytics$Event;", "appendingQuestion", "Lio/elevenlabs/readerapp/core/Survey$Question;", "<init>", "(Ljava/lang/String;Lio/elevenlabs/domain/Analytics$Event;Lio/elevenlabs/readerapp/core/Survey$Question;)V", "getText", "()Ljava/lang/String;", "getAnalyticsEvent", "()Lio/elevenlabs/domain/Analytics$Event;", "getAppendingQuestion", "()Lio/elevenlabs/readerapp/core/Survey$Question;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static final /* data */ class Choice {
            public static final int $stable = 8;
            private final Analytics.Event analyticsEvent;
            private final Question appendingQuestion;
            private final String text;

            public Choice(String str, Analytics.Event event, Question question) {
                str.getClass();
                event.getClass();
                this.text = str;
                this.analyticsEvent = event;
                this.appendingQuestion = question;
            }

            public static /* synthetic */ Choice copy$default(Choice choice, String str, Analytics.Event event, Question question, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = choice.text;
                }
                if ((i10 & 2) != 0) {
                    event = choice.analyticsEvent;
                }
                if ((i10 & 4) != 0) {
                    question = choice.appendingQuestion;
                }
                return choice.copy(str, event, question);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final Analytics.Event getAnalyticsEvent() {
                return this.analyticsEvent;
            }

            /* renamed from: component3, reason: from getter */
            public final Question getAppendingQuestion() {
                return this.appendingQuestion;
            }

            public final Choice copy(String text, Analytics.Event analyticsEvent, Question appendingQuestion) {
                text.getClass();
                analyticsEvent.getClass();
                return new Choice(text, analyticsEvent, appendingQuestion);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Choice)) {
                    return false;
                }
                Choice choice = (Choice) other;
                if (kotlin.jvm.internal.m.c(this.text, choice.text) && kotlin.jvm.internal.m.c(this.analyticsEvent, choice.analyticsEvent) && kotlin.jvm.internal.m.c(this.appendingQuestion, choice.appendingQuestion)) {
                    return true;
                }
                return false;
            }

            public final Analytics.Event getAnalyticsEvent() {
                return this.analyticsEvent;
            }

            public final Question getAppendingQuestion() {
                return this.appendingQuestion;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = (this.analyticsEvent.hashCode() + (this.text.hashCode() * 31)) * 31;
                Question question = this.appendingQuestion;
                if (question == null) {
                    hashCode = 0;
                } else {
                    hashCode = question.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return "Choice(text=" + this.text + ", analyticsEvent=" + this.analyticsEvent + ", appendingQuestion=" + this.appendingQuestion + Separators.RPAREN;
            }
        }

        public Question(QuestionType questionType, String str) {
            questionType.getClass();
            str.getClass();
            this.type = questionType;
            this.question = str;
        }

        public static /* synthetic */ Question copy$default(Question question, QuestionType questionType, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                questionType = question.type;
            }
            if ((i10 & 2) != 0) {
                str = question.question;
            }
            return question.copy(questionType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final QuestionType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        public final Question copy(QuestionType type, String question) {
            type.getClass();
            question.getClass();
            return new Question(type, question);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Question)) {
                return false;
            }
            Question question = (Question) other;
            if (kotlin.jvm.internal.m.c(this.type, question.type) && kotlin.jvm.internal.m.c(this.question, question.question)) {
                return true;
            }
            return false;
        }

        public final String getQuestion() {
            return this.question;
        }

        public final QuestionType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.question.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "Question(type=" + this.type + ", question=" + this.question + Separators.RPAREN;
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType;", "", "<init>", "()V", "SingleSelect", "Open", "Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType$Open;", "Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType$SingleSelect;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* loaded from: classes3.dex */
        public static abstract class QuestionType {
            public static final int $stable = 0;

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\rR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType$Open;", "Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType;", "", "actionText", "", "isMandatory", "placeholder", "Lkotlin/Function1;", "Lio/elevenlabs/domain/Analytics$Event;", "analyticsEventCreator", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lho/l;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lho/l;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lho/l;)Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType$Open;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionText", "Z", "getPlaceholder", "Lho/l;", "getAnalyticsEventCreator", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class Open extends QuestionType {
                public static final int $stable = 0;
                private final String actionText;
                private final ho.l analyticsEventCreator;
                private final boolean isMandatory;
                private final String placeholder;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Open(String str, boolean z6, String str2, ho.l lVar) {
                    super(null);
                    str.getClass();
                    str2.getClass();
                    lVar.getClass();
                    this.actionText = str;
                    this.isMandatory = z6;
                    this.placeholder = str2;
                    this.analyticsEventCreator = lVar;
                }

                public static /* synthetic */ Open copy$default(Open open, String str, boolean z6, String str2, ho.l lVar, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = open.actionText;
                    }
                    if ((i10 & 2) != 0) {
                        z6 = open.isMandatory;
                    }
                    if ((i10 & 4) != 0) {
                        str2 = open.placeholder;
                    }
                    if ((i10 & 8) != 0) {
                        lVar = open.analyticsEventCreator;
                    }
                    return open.copy(str, z6, str2, lVar);
                }

                /* renamed from: component1, reason: from getter */
                public final String getActionText() {
                    return this.actionText;
                }

                /* renamed from: component2, reason: from getter */
                public final boolean getIsMandatory() {
                    return this.isMandatory;
                }

                /* renamed from: component3, reason: from getter */
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                /* renamed from: component4, reason: from getter */
                public final ho.l getAnalyticsEventCreator() {
                    return this.analyticsEventCreator;
                }

                public final Open copy(String actionText, boolean isMandatory, String placeholder, ho.l analyticsEventCreator) {
                    actionText.getClass();
                    placeholder.getClass();
                    analyticsEventCreator.getClass();
                    return new Open(actionText, isMandatory, placeholder, analyticsEventCreator);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Open)) {
                        return false;
                    }
                    Open open = (Open) other;
                    if (kotlin.jvm.internal.m.c(this.actionText, open.actionText) && this.isMandatory == open.isMandatory && kotlin.jvm.internal.m.c(this.placeholder, open.placeholder) && kotlin.jvm.internal.m.c(this.analyticsEventCreator, open.analyticsEventCreator)) {
                        return true;
                    }
                    return false;
                }

                public final String getActionText() {
                    return this.actionText;
                }

                public final ho.l getAnalyticsEventCreator() {
                    return this.analyticsEventCreator;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public int hashCode() {
                    return this.analyticsEventCreator.hashCode() + j0.c.c(com.google.android.gms.internal.play_billing.b.f(this.actionText.hashCode() * 31, 31, this.isMandatory), 31, this.placeholder);
                }

                public final boolean isMandatory() {
                    return this.isMandatory;
                }

                public String toString() {
                    return "Open(actionText=" + this.actionText + ", isMandatory=" + this.isMandatory + ", placeholder=" + this.placeholder + ", analyticsEventCreator=" + this.analyticsEventCreator + Separators.RPAREN;
                }
            }

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType$SingleSelect;", "Lio/elevenlabs/readerapp/core/Survey$Question$QuestionType;", "choices", "", "Lio/elevenlabs/readerapp/core/Survey$Question$Choice;", "<init>", "(Ljava/util/List;)V", "getChoices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* loaded from: classes3.dex */
            public static final /* data */ class SingleSelect extends QuestionType {
                public static final int $stable = 8;
                private final List<Choice> choices;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SingleSelect(List<Choice> list) {
                    super(null);
                    list.getClass();
                    this.choices = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ SingleSelect copy$default(SingleSelect singleSelect, List list, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        list = singleSelect.choices;
                    }
                    return singleSelect.copy(list);
                }

                public final List<Choice> component1() {
                    return this.choices;
                }

                public final SingleSelect copy(List<Choice> choices) {
                    choices.getClass();
                    return new SingleSelect(choices);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if ((other instanceof SingleSelect) && kotlin.jvm.internal.m.c(this.choices, ((SingleSelect) other).choices)) {
                        return true;
                    }
                    return false;
                }

                public final List<Choice> getChoices() {
                    return this.choices;
                }

                public int hashCode() {
                    return this.choices.hashCode();
                }

                public String toString() {
                    return ib.i.k("SingleSelect(choices=", Separators.RPAREN, this.choices);
                }
            }

            public /* synthetic */ QuestionType(kotlin.jvm.internal.f fVar) {
                this();
            }

            private QuestionType() {
            }
        }
    }
}
