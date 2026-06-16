package io.elevenlabs.readerapp.core;

import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.core.Survey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/readerapp/core/SurveyViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/core/SurveyState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/readerapp/core/Survey;", "survey", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "setSurvey", "(Lio/elevenlabs/readerapp/core/Survey;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "handleNextPage", "(Lho/a;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/readerapp/core/Survey$Question$Choice;", "choice", "handleChoice", "(Lio/elevenlabs/readerapp/core/Survey$Question$Choice;Lho/a;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lio/elevenlabs/domain/Analytics$Event;", "event", "logEvent", "(Lio/elevenlabs/domain/Analytics$Event;)V", "Lio/elevenlabs/domain/Analytics;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SurveyViewModel extends MviViewModel<SurveyState> {
    public static final int $stable = 8;
    private final Analytics analytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SurveyViewModel(DispatcherFactory dispatcherFactory, Analytics analytics, Logger logger) {
        super(new SurveyState(null, 0, 3, 0 == true ? 1 : 0), dispatcherFactory, logger);
        dispatcherFactory.getClass();
        analytics.getClass();
        logger.getClass();
        this.analytics = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyState handleChoice$lambda$0(Survey.Question.Choice choice, ho.a aVar, SurveyState surveyState) {
        List<Survey.Question> questions;
        surveyState.getClass();
        Survey survey = null;
        if (choice.getAppendingQuestion() == null) {
            Survey survey2 = surveyState.getSurvey();
            if (survey2 != null && (questions = survey2.getQuestions()) != null) {
                if (surveyState.getCurrentPage() == questions.size() - 1) {
                    aVar.invoke();
                    return surveyState;
                }
            }
            return SurveyState.copy$default(surveyState, null, surveyState.getCurrentPage() + 1, 1, null);
        }
        Survey survey3 = surveyState.getSurvey();
        if (survey3 != null) {
            ArrayList i12 = tn.o.i1(surveyState.getSurvey().getQuestions());
            i12.add(surveyState.getCurrentPage() + 1, choice.getAppendingQuestion());
            survey = survey3.copy(i12);
        }
        return surveyState.copy(survey, surveyState.getCurrentPage() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyState handleNextPage$lambda$0(ho.a aVar, SurveyState surveyState) {
        List<Survey.Question> questions;
        surveyState.getClass();
        Survey survey = surveyState.getSurvey();
        if (survey != null && (questions = survey.getQuestions()) != null) {
            if (surveyState.getCurrentPage() == questions.size() - 1) {
                aVar.invoke();
                return surveyState;
            }
        }
        return SurveyState.copy$default(surveyState, null, surveyState.getCurrentPage() + 1, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyState setSurvey$lambda$0(Survey survey, SurveyState surveyState) {
        surveyState.getClass();
        return SurveyState.copy$default(surveyState, survey, 0, 2, null);
    }

    public final MviViewModel.StateUpdate handleChoice(Survey.Question.Choice choice, ho.a onDismiss) {
        choice.getClass();
        onDismiss.getClass();
        return queueStateUpdate(new i(choice, onDismiss, 1));
    }

    public final MviViewModel.StateUpdate handleNextPage(ho.a onDismiss) {
        onDismiss.getClass();
        return queueStateUpdate(new b(onDismiss, 6));
    }

    public final void logEvent(Analytics.Event event) {
        event.getClass();
        this.analytics.log(event);
    }

    public final MviViewModel.StateUpdate setSurvey(Survey survey) {
        survey.getClass();
        return queueStateUpdate(new b(survey, 5));
    }
}
