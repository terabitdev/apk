package io.elevenlabs.data.services;

import io.elevenlabs.data.api.InterestsAnswerResponseModel;
import io.elevenlabs.data.api.InterestsQuestionResponseModel;
import io.elevenlabs.domain.model.InterestsAnswer;
import io.elevenlabs.domain.model.InterestsQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/InterestsQuestion;", "Lio/elevenlabs/data/api/InterestsQuestionResponseModel;", "Lio/elevenlabs/domain/model/InterestsAnswer;", "Lio/elevenlabs/data/api/InterestsAnswerResponseModel;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class InterestsServiceImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InterestsQuestion toDomain(InterestsQuestionResponseModel interestsQuestionResponseModel) {
        String key = interestsQuestionResponseModel.getKey();
        String title = interestsQuestionResponseModel.getTitle();
        boolean optional = interestsQuestionResponseModel.getOptional();
        List<InterestsAnswerResponseModel> answers = interestsQuestionResponseModel.getAnswers();
        ArrayList arrayList = new ArrayList(p.a0(answers, 10));
        Iterator<T> it = answers.iterator();
        while (it.hasNext()) {
            arrayList.add(toDomain((InterestsAnswerResponseModel) it.next()));
        }
        return new InterestsQuestion(key, title, optional, arrayList);
    }

    private static final InterestsAnswer toDomain(InterestsAnswerResponseModel interestsAnswerResponseModel) {
        return new InterestsAnswer(interestsAnswerResponseModel.getKey(), interestsAnswerResponseModel.getTitle(), interestsAnswerResponseModel.getSelected(), interestsAnswerResponseModel.getIcon());
    }
}
