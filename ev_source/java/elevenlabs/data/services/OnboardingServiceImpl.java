package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.OnboardingAPI;
import io.elevenlabs.data.database.entities.voices.VoiceEntity;
import io.elevenlabs.data.database.entities.voices.VoicesDao;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.data.mapping.VoiceMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.ReaderOnboardingAnswerModel;
import io.elevenlabs.data.model.ReaderOnboardingQuestionModel;
import io.elevenlabs.data.model.ReaderOnboardingSurveyModelOutput;
import io.elevenlabs.data.model.response.IntroScreensResponseModel;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.BookPreviewIntro;
import io.elevenlabs.domain.model.Intro;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.domain.model.PodcastPreviewIntro;
import io.elevenlabs.domain.model.StreaksIntro;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoicePreviewIntro;
import io.elevenlabs.domain.services.OnboardingService;
import io.elevenlabs.domain.services.WhatsNewService;
import ir.d1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import livekit.LivekitInternal$NodeStats;
import oo.u;
import sn.z;
import tn.p;
import tn.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0011J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u0011J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u0011J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u00172\u0006\u0010\u001d\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0017H\u0096@¢\u0006\u0004\b!\u0010\u0011J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010%J\u000f\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u0002008\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082D¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u00106\u001a\u0002008\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00107\u001a\u0002008\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00102R+\u0010>\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010%\"\u0004\b<\u0010=R+\u0010E\u001a\u00020?2\u0006\u00108\u001a\u00020?8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR+\u0010L\u001a\u00020F2\u0006\u00108\u001a\u00020F8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010P\u001a\u00020F2\u0006\u00108\u001a\u00020F8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010:\u001a\u0004\bN\u0010I\"\u0004\bO\u0010K¨\u0006Q"}, d2 = {"Lio/elevenlabs/data/services/OnboardingServiceImpl;", "Lio/elevenlabs/domain/services/OnboardingService;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lio/elevenlabs/data/api/OnboardingAPI;", "onboardingAPI", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "voicesDao", "Lio/elevenlabs/domain/services/WhatsNewService;", "whatsNewService", "<init>", "(Landroid/content/SharedPreferences;Lio/elevenlabs/data/api/OnboardingAPI;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/data/database/entities/voices/VoicesDao;Lio/elevenlabs/domain/services/WhatsNewService;)V", "Lir/i;", "", "hasCompletedOnboarding", "(Lwn/c;)Ljava/lang/Object;", "hasCompletedAgeOnboarding", "Lsn/z;", "complete", "completeAgeOnboarding", SDPKeywords.CLEAR, "Lio/elevenlabs/domain/model/AsyncCallResult;", "", "Lio/elevenlabs/domain/model/Voice;", "getSuggestedVoices", "Lio/elevenlabs/domain/model/OnboardingSurvey;", "getOnboarding", "survey", "sendOnboarding", "(Lio/elevenlabs/domain/model/OnboardingSurvey;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/Intro;", "getIntro", "shouldShowPaywall", "()Lir/i;", "hasUserSeenPaywall", "()Z", "seenPaywall", "()V", "recordAppSession", "isWinBackCooldownActive", "seenWinBackPaywall", "Landroid/content/SharedPreferences;", "Lio/elevenlabs/data/api/OnboardingAPI;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "Lio/elevenlabs/domain/services/WhatsNewService;", "", "prefOnboardingCompleted", "Ljava/lang/String;", "prefAgeOnboardingCompleted", "prefHasSeenPaywall", "prefReturnSessionCount", "prefLastPaywallViewTimestamp", "prefLastWinBackPaywallTimestamp", "<set-?>", "hasSeenPaywall$delegate", "Lko/b;", "getHasSeenPaywall", "setHasSeenPaywall", "(Z)V", "hasSeenPaywall", "", "returnSessionCount$delegate", "getReturnSessionCount", "()I", "setReturnSessionCount", "(I)V", "returnSessionCount", "", "lastPaywallViewTimestamp$delegate", "getLastPaywallViewTimestamp", "()J", "setLastPaywallViewTimestamp", "(J)V", "lastPaywallViewTimestamp", "lastWinBackPaywallTimestamp$delegate", "getLastWinBackPaywallTimestamp$data_release", "setLastWinBackPaywallTimestamp$data_release", "lastWinBackPaywallTimestamp", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OnboardingServiceImpl implements OnboardingService {
    static final /* synthetic */ u[] $$delegatedProperties = {new q(OnboardingServiceImpl.class, "hasSeenPaywall", "getHasSeenPaywall()Z", 0), new q(OnboardingServiceImpl.class, "returnSessionCount", "getReturnSessionCount()I", 0), new q(OnboardingServiceImpl.class, "lastPaywallViewTimestamp", "getLastPaywallViewTimestamp()J", 0), new q(OnboardingServiceImpl.class, "lastWinBackPaywallTimestamp", "getLastWinBackPaywallTimestamp$data_release()J", 0)};
    private final Analytics analytics;

    /* renamed from: hasSeenPaywall$delegate, reason: from kotlin metadata */
    private final ko.b hasSeenPaywall;

    /* renamed from: lastPaywallViewTimestamp$delegate, reason: from kotlin metadata */
    private final ko.b lastPaywallViewTimestamp;

    /* renamed from: lastWinBackPaywallTimestamp$delegate, reason: from kotlin metadata */
    private final ko.b lastWinBackPaywallTimestamp;
    private final OnboardingAPI onboardingAPI;
    private final String prefAgeOnboardingCompleted;
    private final String prefHasSeenPaywall;
    private final String prefLastPaywallViewTimestamp;
    private final String prefLastWinBackPaywallTimestamp;
    private final String prefOnboardingCompleted;
    private final String prefReturnSessionCount;

    /* renamed from: returnSessionCount$delegate, reason: from kotlin metadata */
    private final ko.b returnSessionCount;
    private final SharedPreferences sharedPreferences;
    private final VoicesDao voicesDao;
    private final WhatsNewService whatsNewService;

    public OnboardingServiceImpl(@UserSharedPreferences SharedPreferences sharedPreferences, OnboardingAPI onboardingAPI, Analytics analytics, VoicesDao voicesDao, WhatsNewService whatsNewService) {
        sharedPreferences.getClass();
        onboardingAPI.getClass();
        analytics.getClass();
        voicesDao.getClass();
        whatsNewService.getClass();
        this.sharedPreferences = sharedPreferences;
        this.onboardingAPI = onboardingAPI;
        this.analytics = analytics;
        this.voicesDao = voicesDao;
        this.whatsNewService = whatsNewService;
        this.prefOnboardingCompleted = "ONBOARDING_COMPLETED";
        this.prefAgeOnboardingCompleted = "AGE_ONBOARDING_COMPLETED";
        this.prefHasSeenPaywall = "HAS_SEEN_PAYWALL";
        this.prefReturnSessionCount = "RETURN_SESSION_COUNT";
        this.prefLastPaywallViewTimestamp = "LAST_PAYWALL_VIEW_TIMESTAMP";
        this.prefLastWinBackPaywallTimestamp = "LAST_WIN_BACK_PAYWALL_TIMESTAMP";
        this.hasSeenPaywall = SharedPreferencesExtensionsKt.sharedPreferencesProperty(sharedPreferences, "HAS_SEEN_PAYWALL", false);
        this.returnSessionCount = SharedPreferencesExtensionsKt.sharedPreferencesProperty(sharedPreferences, "RETURN_SESSION_COUNT", 0);
        this.lastPaywallViewTimestamp = SharedPreferencesExtensionsKt.sharedPreferencesProperty(sharedPreferences, "LAST_PAYWALL_VIEW_TIMESTAMP", 0L);
        this.lastWinBackPaywallTimestamp = SharedPreferencesExtensionsKt.sharedPreferencesProperty(sharedPreferences, "LAST_WIN_BACK_PAYWALL_TIMESTAMP", 0L);
        if (sharedPreferences.getBoolean("ONBOARDING_COMPLETED", false) && !sharedPreferences.getBoolean("AGE_ONBOARDING_COMPLETED", false)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("AGE_ONBOARDING_COMPLETED", true);
            edit.apply();
        }
    }

    public static /* synthetic */ List a(List list, List list2) {
        return getSuggestedVoices$lambda$0(list, list2);
    }

    public static /* synthetic */ Intro b(IntroScreensResponseModel introScreensResponseModel) {
        return getIntro$lambda$0(introScreensResponseModel);
    }

    public static /* synthetic */ OnboardingSurvey c(ReaderOnboardingSurveyModelOutput readerOnboardingSurveyModelOutput) {
        return getOnboarding$lambda$0(readerOnboardingSurveyModelOutput);
    }

    public final boolean getHasSeenPaywall() {
        return ((Boolean) this.hasSeenPaywall.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public static final Intro getIntro$lambda$0(IntroScreensResponseModel introScreensResponseModel) {
        introScreensResponseModel.getClass();
        return new Intro(new BookPreviewIntro(introScreensResponseModel.getBookPreview().getBackgroundVideoLightUrl(), introScreensResponseModel.getBookPreview().getBackgroundVideoDarkUrl(), introScreensResponseModel.getBookPreview().getBackgroundImageLightUrl(), introScreensResponseModel.getBookPreview().getBackgroundImageDarkUrl(), introScreensResponseModel.getBookPreview().getCoverImageUrl(), introScreensResponseModel.getBookPreview().getPreviewUrl(), introScreensResponseModel.getBookPreview().getName(), introScreensResponseModel.getBookPreview().getAuthor(), introScreensResponseModel.getBookPreview().getMetadata()), new VoicePreviewIntro(introScreensResponseModel.getVoicePreview().getPreviewUrl(), introScreensResponseModel.getVoicePreview().getImageUrl(), introScreensResponseModel.getVoicePreview().getName(), introScreensResponseModel.getVoicePreview().getSubtitle(), introScreensResponseModel.getVoicePreview().getMetadata()), new PodcastPreviewIntro(introScreensResponseModel.getPodcastPreview().getOrbsImageUrl(), introScreensResponseModel.getPodcastPreview().getPreviewUrl(), introScreensResponseModel.getPodcastPreview().getTitle(), introScreensResponseModel.getPodcastPreview().getSubtitle()), new StreaksIntro(introScreensResponseModel.getStreaks().getStreakImageUrl(), introScreensResponseModel.getStreaks().getStreakFullImageUrl()));
    }

    public final long getLastPaywallViewTimestamp() {
        return ((Number) this.lastPaywallViewTimestamp.getValue(this, $$delegatedProperties[2])).longValue();
    }

    public static final OnboardingSurvey getOnboarding$lambda$0(ReaderOnboardingSurveyModelOutput readerOnboardingSurveyModelOutput) {
        boolean z6;
        readerOnboardingSurveyModelOutput.getClass();
        Long birthdayUnix = readerOnboardingSurveyModelOutput.getBirthdayUnix();
        List<ReaderOnboardingQuestionModel> questions = readerOnboardingSurveyModelOutput.getQuestions();
        if (questions == null) {
            questions = t.f33547a;
        }
        ArrayList arrayList = new ArrayList(p.a0(questions, 10));
        for (ReaderOnboardingQuestionModel readerOnboardingQuestionModel : questions) {
            String key = readerOnboardingQuestionModel.getKey();
            String title = readerOnboardingQuestionModel.getTitle();
            boolean optional = readerOnboardingQuestionModel.getOptional();
            Boolean singleSelection = readerOnboardingQuestionModel.getSingleSelection();
            if (singleSelection != null) {
                z6 = singleSelection.booleanValue();
            } else {
                z6 = false;
            }
            boolean z10 = z6;
            List<ReaderOnboardingAnswerModel> answers = readerOnboardingQuestionModel.getAnswers();
            ArrayList arrayList2 = new ArrayList(p.a0(answers, 10));
            for (ReaderOnboardingAnswerModel readerOnboardingAnswerModel : answers) {
                arrayList2.add(new OnboardingSurvey.Answer(readerOnboardingAnswerModel.getKey(), readerOnboardingAnswerModel.getTitle(), readerOnboardingAnswerModel.getSelected(), readerOnboardingAnswerModel.getIcon()));
            }
            arrayList.add(new OnboardingSurvey.Question(key, title, optional, arrayList2, z10));
        }
        return new OnboardingSurvey(birthdayUnix, arrayList);
    }

    public final int getReturnSessionCount() {
        return ((Number) this.returnSessionCount.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public static final List getSuggestedVoices$lambda$0(List list, List list2) {
        list2.getClass();
        ArrayList arrayList = new ArrayList(p.a0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            VoiceEntity entity = VoiceMappingKt.toEntity((VoiceItemResponseModel) it.next());
            list.add(entity);
            arrayList.add(VoiceMappingKt.toDomain(entity));
        }
        return arrayList;
    }

    private final void setHasSeenPaywall(boolean z6) {
        this.hasSeenPaywall.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z6));
    }

    private final void setLastPaywallViewTimestamp(long j4) {
        this.lastPaywallViewTimestamp.setValue(this, $$delegatedProperties[2], Long.valueOf(j4));
    }

    private final void setReturnSessionCount(int i10) {
        this.returnSessionCount.setValue(this, $$delegatedProperties[1], Integer.valueOf(i10));
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public Object clear(wn.c<? super z> cVar) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(this.prefOnboardingCompleted, false).putBoolean(this.prefAgeOnboardingCompleted, false);
        edit.apply();
        setHasSeenPaywall(false);
        setReturnSessionCount(0);
        setLastPaywallViewTimestamp(0L);
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public Object complete(wn.c<? super z> cVar) {
        this.analytics.log(Analytics.Event.OnboardingCompletedOnboarding.INSTANCE);
        this.whatsNewService.delayUntilNextSession();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(this.prefOnboardingCompleted, true).putBoolean(this.prefAgeOnboardingCompleted, true);
        edit.apply();
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public Object completeAgeOnboarding(wn.c<? super z> cVar) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putBoolean(this.prefAgeOnboardingCompleted, true);
        edit.apply();
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIntro(wn.c<? super AsyncCallResult<Intro>> cVar) {
        OnboardingServiceImpl$getIntro$1 onboardingServiceImpl$getIntro$1;
        int i10;
        if (cVar instanceof OnboardingServiceImpl$getIntro$1) {
            onboardingServiceImpl$getIntro$1 = (OnboardingServiceImpl$getIntro$1) cVar;
            int i11 = onboardingServiceImpl$getIntro$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                onboardingServiceImpl$getIntro$1.label = i11 - Integer.MIN_VALUE;
                Object obj = onboardingServiceImpl$getIntro$1.result;
                i10 = onboardingServiceImpl$getIntro$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    OnboardingAPI onboardingAPI = this.onboardingAPI;
                    onboardingServiceImpl$getIntro$1.label = 1;
                    obj = onboardingAPI.getIntro(onboardingServiceImpl$getIntro$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(19));
            }
        }
        onboardingServiceImpl$getIntro$1 = new OnboardingServiceImpl$getIntro$1(this, cVar);
        Object obj2 = onboardingServiceImpl$getIntro$1.result;
        i10 = onboardingServiceImpl$getIntro$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(19));
    }

    public final long getLastWinBackPaywallTimestamp$data_release() {
        return ((Number) this.lastWinBackPaywallTimestamp.getValue(this, $$delegatedProperties[3])).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getOnboarding(wn.c<? super AsyncCallResult<OnboardingSurvey>> cVar) {
        OnboardingServiceImpl$getOnboarding$1 onboardingServiceImpl$getOnboarding$1;
        int i10;
        if (cVar instanceof OnboardingServiceImpl$getOnboarding$1) {
            onboardingServiceImpl$getOnboarding$1 = (OnboardingServiceImpl$getOnboarding$1) cVar;
            int i11 = onboardingServiceImpl$getOnboarding$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                onboardingServiceImpl$getOnboarding$1.label = i11 - Integer.MIN_VALUE;
                Object obj = onboardingServiceImpl$getOnboarding$1.result;
                i10 = onboardingServiceImpl$getOnboarding$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    OnboardingAPI onboardingAPI = this.onboardingAPI;
                    onboardingServiceImpl$getOnboarding$1.label = 1;
                    obj = onboardingAPI.getOnboardingAnswers(onboardingServiceImpl$getOnboarding$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new b(18));
            }
        }
        onboardingServiceImpl$getOnboarding$1 = new OnboardingServiceImpl$getOnboarding$1(this, cVar);
        Object obj2 = onboardingServiceImpl$getOnboarding$1.result;
        i10 = onboardingServiceImpl$getOnboarding$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new b(18));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSuggestedVoices(wn.c<? super AsyncCallResult<List<Voice>>> cVar) {
        OnboardingServiceImpl$getSuggestedVoices$1 onboardingServiceImpl$getSuggestedVoices$1;
        int i10;
        List<VoiceEntity> list;
        if (cVar instanceof OnboardingServiceImpl$getSuggestedVoices$1) {
            onboardingServiceImpl$getSuggestedVoices$1 = (OnboardingServiceImpl$getSuggestedVoices$1) cVar;
            int i11 = onboardingServiceImpl$getSuggestedVoices$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                onboardingServiceImpl$getSuggestedVoices$1.label = i11 - Integer.MIN_VALUE;
                Object obj = onboardingServiceImpl$getSuggestedVoices$1.result;
                i10 = onboardingServiceImpl$getSuggestedVoices$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        list = (List) onboardingServiceImpl$getSuggestedVoices$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    ArrayList arrayList = new ArrayList();
                    OnboardingAPI onboardingAPI = this.onboardingAPI;
                    onboardingServiceImpl$getSuggestedVoices$1.L$0 = arrayList;
                    onboardingServiceImpl$getSuggestedVoices$1.label = 1;
                    Object suggestedVoices = onboardingAPI.getSuggestedVoices(onboardingServiceImpl$getSuggestedVoices$1);
                    xn.a aVar = xn.a.f37986a;
                    if (suggestedVoices == aVar) {
                        return aVar;
                    }
                    list = arrayList;
                    obj = suggestedVoices;
                }
                AsyncCallResult map = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj), new a(list, 2));
                this.voicesDao.insertAll(list);
                return map;
            }
        }
        onboardingServiceImpl$getSuggestedVoices$1 = new OnboardingServiceImpl$getSuggestedVoices$1(this, cVar);
        Object obj2 = onboardingServiceImpl$getSuggestedVoices$1.result;
        i10 = onboardingServiceImpl$getSuggestedVoices$1.label;
        if (i10 == 0) {
        }
        AsyncCallResult map2 = ApiResultExtensionKt.map(ApiResultExtensionKt.toDomain((ApiResult) obj2), new a(list, 2));
        this.voicesDao.insertAll(list);
        return map2;
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public Object hasCompletedAgeOnboarding(wn.c<? super ir.i> cVar) {
        return SharedPreferencesExtensionsKt.observe(this.sharedPreferences, this.prefAgeOnboardingCompleted, new OnboardingServiceImpl$hasCompletedAgeOnboarding$2(this, null));
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public Object hasCompletedOnboarding(wn.c<? super ir.i> cVar) {
        return SharedPreferencesExtensionsKt.observe(this.sharedPreferences, this.prefOnboardingCompleted, new OnboardingServiceImpl$hasCompletedOnboarding$2(this, null));
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public boolean hasUserSeenPaywall() {
        return getHasSeenPaywall();
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public boolean isWinBackCooldownActive() {
        long lastWinBackPaywallTimestamp$data_release = getLastWinBackPaywallTimestamp$data_release();
        if (lastWinBackPaywallTimestamp$data_release <= 0 || System.currentTimeMillis() - lastWinBackPaywallTimestamp$data_release >= OfflineReadData.EXPIRY_WARNING_MILLIS) {
            return false;
        }
        return true;
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public void recordAppSession() {
        setReturnSessionCount(getReturnSessionCount() + 1);
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public void seenPaywall() {
        setHasSeenPaywall(true);
        setLastPaywallViewTimestamp(System.currentTimeMillis());
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public void seenWinBackPaywall() {
        setLastWinBackPaywallTimestamp$data_release(System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.elevenlabs.domain.services.OnboardingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendOnboarding(OnboardingSurvey onboardingSurvey, wn.c<? super AsyncCallResult<z>> cVar) {
        OnboardingServiceImpl$sendOnboarding$1 onboardingServiceImpl$sendOnboarding$1;
        int i10;
        if (cVar instanceof OnboardingServiceImpl$sendOnboarding$1) {
            onboardingServiceImpl$sendOnboarding$1 = (OnboardingServiceImpl$sendOnboarding$1) cVar;
            int i11 = onboardingServiceImpl$sendOnboarding$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                onboardingServiceImpl$sendOnboarding$1.label = i11 - Integer.MIN_VALUE;
                Object obj = onboardingServiceImpl$sendOnboarding$1.result;
                i10 = onboardingServiceImpl$sendOnboarding$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    OnboardingAPI onboardingAPI = this.onboardingAPI;
                    Long birthdayUnix = onboardingSurvey.getBirthdayUnix();
                    List<OnboardingSurvey.Question> questions = onboardingSurvey.getQuestions();
                    int i12 = 10;
                    ArrayList arrayList = new ArrayList(p.a0(questions, 10));
                    for (OnboardingSurvey.Question question : questions) {
                        String key = question.getKey();
                        String title = question.getTitle();
                        boolean optional = question.getOptional();
                        List<OnboardingSurvey.Answer> answers = question.getAnswers();
                        ArrayList arrayList2 = new ArrayList(p.a0(answers, i12));
                        for (OnboardingSurvey.Answer answer : answers) {
                            arrayList2.add(new ReaderOnboardingAnswerModel(answer.getKey(), answer.getTitle(), answer.getSelected(), answer.getIcon()));
                        }
                        arrayList.add(new ReaderOnboardingQuestionModel(key, title, optional, arrayList2, (Boolean) null, 16, (kotlin.jvm.internal.f) null));
                        i12 = 10;
                    }
                    ReaderOnboardingSurveyModelOutput readerOnboardingSurveyModelOutput = new ReaderOnboardingSurveyModelOutput((Boolean) null, birthdayUnix, arrayList, 1, (kotlin.jvm.internal.f) null);
                    onboardingServiceImpl$sendOnboarding$1.L$0 = null;
                    onboardingServiceImpl$sendOnboarding$1.label = 1;
                    obj = onboardingAPI.postOnboardingAnswers(readerOnboardingSurveyModelOutput, onboardingServiceImpl$sendOnboarding$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return ApiResultExtensionKt.toDomain((ApiResult) obj);
            }
        }
        onboardingServiceImpl$sendOnboarding$1 = new OnboardingServiceImpl$sendOnboarding$1(this, cVar);
        Object obj2 = onboardingServiceImpl$sendOnboarding$1.result;
        i10 = onboardingServiceImpl$sendOnboarding$1.label;
        if (i10 == 0) {
        }
        return ApiResultExtensionKt.toDomain((ApiResult) obj2);
    }

    public final void setLastWinBackPaywallTimestamp$data_release(long j4) {
        this.lastWinBackPaywallTimestamp.setValue(this, $$delegatedProperties[3], Long.valueOf(j4));
    }

    @Override // io.elevenlabs.domain.services.OnboardingService
    public ir.i shouldShowPaywall() {
        ir.i observe = SharedPreferencesExtensionsKt.observe(this.sharedPreferences, this.prefHasSeenPaywall, new OnboardingServiceImpl$shouldShowPaywall$hasSeenPaywallFlow$1(this, null));
        final ir.i observe2 = SharedPreferencesExtensionsKt.observe(this.sharedPreferences, this.prefReturnSessionCount, new OnboardingServiceImpl$shouldShowPaywall$returnSessionPaywallFlow$1(this, null));
        return new d1(observe, new ir.i() { // from class: io.elevenlabs.data.services.OnboardingServiceImpl$shouldShowPaywall$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.OnboardingServiceImpl$shouldShowPaywall$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;
                final /* synthetic */ OnboardingServiceImpl this$0;

                @yn.e(c = "io.elevenlabs.data.services.OnboardingServiceImpl$shouldShowPaywall$$inlined$map$1$2", f = "OnboardingServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.OnboardingServiceImpl$shouldShowPaywall$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(wn.c cVar) {
                        super(cVar);
                    }

                    @Override // yn.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(ir.j jVar, OnboardingServiceImpl onboardingServiceImpl) {
                    this.$this_unsafeFlow = jVar;
                    this.this$0 = onboardingServiceImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    long lastPaywallViewTimestamp;
                    Boolean bool;
                    long lastPaywallViewTimestamp2;
                    if (cVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) cVar;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                                if (i10 == 1) {
                                    sn.a.g(obj2);
                                } else {
                                    c6.x("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                sn.a.g(obj2);
                                ir.j jVar = this.$this_unsafeFlow;
                                if (((Number) obj).intValue() == 4) {
                                    bool = Boolean.TRUE;
                                } else {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    lastPaywallViewTimestamp = this.this$0.getLastPaywallViewTimestamp();
                                    if (lastPaywallViewTimestamp > 0) {
                                        lastPaywallViewTimestamp2 = this.this$0.getLastPaywallViewTimestamp();
                                        if (currentTimeMillis - lastPaywallViewTimestamp2 > 1814400000) {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    bool = Boolean.FALSE;
                                }
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(bool, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar, this), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        }, new OnboardingServiceImpl$shouldShowPaywall$1(null), 1);
    }
}
