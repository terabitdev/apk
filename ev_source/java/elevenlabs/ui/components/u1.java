package io.elevenlabs.ui.components;

import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorActionsSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileHeaderKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.headers.HeaderKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17671b;

    public /* synthetic */ u1(int i10, int i11) {
        this.f17670a = i11;
        this.f17671b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Preview_RadioButton$lambda$1;
        sn.z Preview_Select$lambda$1;
        sn.z Preview_SelectableBadgeBox$lambda$1;
        sn.z Preview_SelectableBox$lambda$1;
        sn.z Preview_SelectableCard$lambda$1;
        sn.z Preview_SelectableCardV2$lambda$0;
        sn.z Preview_Slider$lambda$4;
        sn.z Preview_SquareIconButton$lambda$1;
        sn.z Preview_SwipeToActionBox_StartSideOpen$lambda$1;
        sn.z TestingSwipeToActionBoxContent$lambda$1;
        sn.z Preview_SwipeToActionBox_EndSideOpen$lambda$1;
        sn.z Preview_VerificationCodeInput$lambda$1;
        sn.z Preview_AuthorProfileHeader$lambda$0;
        int i10 = this.f17670a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ProgressBarKt.a(this.f17671b, mVar, intValue);
            case 1:
                Preview_RadioButton$lambda$1 = RadioButtonKt.Preview_RadioButton$lambda$1(this.f17671b, mVar, intValue);
                return Preview_RadioButton$lambda$1;
            case 2:
                return ReadItemCoverKt.c(this.f17671b, mVar, intValue);
            case 3:
                return ReorderableRowKt.h(this.f17671b, mVar, intValue);
            case 4:
                return SectionHeaderKt.i(this.f17671b, mVar, intValue);
            case 5:
                return SegmentedSelectorControlKt.d(this.f17671b, mVar, intValue);
            case 6:
                Preview_Select$lambda$1 = SelectKt.Preview_Select$lambda$1(this.f17671b, mVar, intValue);
                return Preview_Select$lambda$1;
            case 7:
                Preview_SelectableBadgeBox$lambda$1 = SelectableBadgeBoxKt.Preview_SelectableBadgeBox$lambda$1(this.f17671b, mVar, intValue);
                return Preview_SelectableBadgeBox$lambda$1;
            case 8:
                Preview_SelectableBox$lambda$1 = SelectableBoxKt.Preview_SelectableBox$lambda$1(this.f17671b, mVar, intValue);
                return Preview_SelectableBox$lambda$1;
            case 9:
                Preview_SelectableCard$lambda$1 = SelectableCardKt.Preview_SelectableCard$lambda$1(this.f17671b, mVar, intValue);
                return Preview_SelectableCard$lambda$1;
            case 10:
                Preview_SelectableCardV2$lambda$0 = SelectableCardV2Kt.Preview_SelectableCardV2$lambda$0(this.f17671b, mVar, intValue);
                return Preview_SelectableCardV2$lambda$0;
            case 11:
                Preview_Slider$lambda$4 = SliderKt.Preview_Slider$lambda$4(this.f17671b, mVar, intValue);
                return Preview_Slider$lambda$4;
            case 12:
                Preview_SquareIconButton$lambda$1 = SquareIconButtonKt.Preview_SquareIconButton$lambda$1(this.f17671b, mVar, intValue);
                return Preview_SquareIconButton$lambda$1;
            case 13:
                return StackedNotificationKt.b(this.f17671b, mVar, intValue);
            case 14:
                return StackedNotificationKt.a(this.f17671b, mVar, intValue);
            case 15:
                Preview_SwipeToActionBox_StartSideOpen$lambda$1 = SwipeToActionBoxKt.Preview_SwipeToActionBox_StartSideOpen$lambda$1(this.f17671b, mVar, intValue);
                return Preview_SwipeToActionBox_StartSideOpen$lambda$1;
            case 16:
                TestingSwipeToActionBoxContent$lambda$1 = SwipeToActionBoxKt.TestingSwipeToActionBoxContent$lambda$1(this.f17671b, mVar, intValue);
                return TestingSwipeToActionBoxContent$lambda$1;
            case 17:
                Preview_SwipeToActionBox_EndSideOpen$lambda$1 = SwipeToActionBoxKt.Preview_SwipeToActionBox_EndSideOpen$lambda$1(this.f17671b, mVar, intValue);
                return Preview_SwipeToActionBox_EndSideOpen$lambda$1;
            case 18:
                return UltraBadgeKt.b(this.f17671b, mVar, intValue);
            case 19:
                return UnreadIndicatorKt.a(this.f17671b, mVar, intValue);
            case 20:
                Preview_VerificationCodeInput$lambda$1 = VerificationCodeInputKt.Preview_VerificationCodeInput$lambda$1(this.f17671b, mVar, intValue);
                return Preview_VerificationCodeInput$lambda$1;
            case 21:
                return VoiceAvatarKt.a(this.f17671b, mVar, intValue);
            case 22:
                return VoiceCircleKt.f(this.f17671b, mVar, intValue);
            case 23:
                return ZoomableBoxKt.d(this.f17671b, mVar, intValue);
            case 24:
                return HeaderActionsKt.c(this.f17671b, mVar, intValue);
            case 25:
                return HeaderKt.f(this.f17671b, mVar, intValue);
            case 26:
                return AuthorActionsSectionKt.c(this.f17671b, mVar, intValue);
            case 27:
                return AuthorActionsSectionKt.d(this.f17671b, mVar, intValue);
            case 28:
                return AuthorActionsSectionKt.e(this.f17671b, mVar, intValue);
            default:
                Preview_AuthorProfileHeader$lambda$0 = AuthorProfileHeaderKt.Preview_AuthorProfileHeader$lambda$0(this.f17671b, mVar, intValue);
                return Preview_AuthorProfileHeader$lambda$0;
        }
    }
}
