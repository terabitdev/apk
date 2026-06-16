package io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps;

import fr.g2;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$AuthorActionsSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$AuthorActionsSectionPreviewFollowingDefaultGroupAuthorActionsSectionPreviewFollowingKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$AuthorActionsSectionPreviewLoadingDefaultGroupAuthorActionsSectionPreviewLoadingKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$AuthorActionsSectionPreviewNotFollowingDefaultGroupAuthorActionsSectionPreviewNotFollowingKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$AuthorProfileHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$AuthorProfileSortRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$PreviewAuthorProfileHeaderDefaultGroupPreviewAuthorProfileHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$PreviewAuthorProfileHeaderMinimalInfoDefaultGroupPreviewAuthorProfileHeaderMinimalInfoKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$PreviewAuthorProfileSortRowDefaultGroupPreviewAuthorProfileSortRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.ComposableSingletons$PreviewAuthorProfileSortRowNoCountDefaultGroupPreviewAuthorProfileSortRowNoCountKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.DownloadAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.ComposableSingletons$PlayerActionsSheetKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import kr.v;
import kr.y;
import l1.f2;
import r1.b3;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17183a;

    public /* synthetic */ a(int i10) {
        this.f17183a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z lambda_1105934662$lambda$0;
        b3 BottomSheetScaffold_jb_40ds$lambda$6;
        z lambda_1902130568$lambda$0;
        z lambda__1797241144$lambda$0;
        Integer num;
        int i10;
        switch (this.f17183a) {
            case 0:
                lambda_1105934662$lambda$0 = ComposableSingletons$VoiceDesignTipsSheetKt.lambda_1105934662$lambda$0((m) obj, ((Integer) obj2).intValue());
                return lambda_1105934662$lambda$0;
            case 1:
                return ComposableSingletons$VoicePromptStepKt.b((m) obj, ((Integer) obj2).intValue());
            case 2:
                return ComposableSingletons$VoicePromptStepKt.a((m) obj, ((Integer) obj2).intValue());
            case 3:
                BottomSheetScaffold_jb_40ds$lambda$6 = BottomSheetScaffoldKt.BottomSheetScaffold_jb_40ds$lambda$6((m) obj, ((Integer) obj2).intValue());
                return BottomSheetScaffold_jb_40ds$lambda$6;
            case 4:
                return Boolean.valueOf(kotlin.jvm.internal.m.c(obj, obj2));
            case 5:
                return ComposableSingletons$AuthorActionsSectionKt.e((m) obj, ((Integer) obj2).intValue());
            case 6:
                return ComposableSingletons$AuthorActionsSectionKt.a((m) obj, ((Integer) obj2).intValue());
            case 7:
                return ComposableSingletons$AuthorActionsSectionKt.c((m) obj, ((Integer) obj2).intValue());
            case 8:
                lambda_1902130568$lambda$0 = ComposableSingletons$AuthorActionsSectionPreviewFollowingDefaultGroupAuthorActionsSectionPreviewFollowingKt.lambda_1902130568$lambda$0((m) obj, ((Integer) obj2).intValue());
                return lambda_1902130568$lambda$0;
            case 9:
                lambda__1797241144$lambda$0 = ComposableSingletons$AuthorActionsSectionPreviewLoadingDefaultGroupAuthorActionsSectionPreviewLoadingKt.lambda__1797241144$lambda$0((m) obj, ((Integer) obj2).intValue());
                return lambda__1797241144$lambda$0;
            case 10:
                return ComposableSingletons$AuthorActionsSectionPreviewNotFollowingDefaultGroupAuthorActionsSectionPreviewNotFollowingKt.a((m) obj, ((Integer) obj2).intValue());
            case 11:
                return ComposableSingletons$AuthorProfileHeaderKt.b((m) obj, ((Integer) obj2).intValue());
            case 12:
                return ComposableSingletons$AuthorProfileHeaderKt.a((m) obj, ((Integer) obj2).intValue());
            case 13:
                return ComposableSingletons$AuthorProfileSortRowKt.a((m) obj, ((Integer) obj2).intValue());
            case 14:
                return ComposableSingletons$AuthorProfileSortRowKt.d((m) obj, ((Integer) obj2).intValue());
            case 15:
                return ComposableSingletons$PreviewAuthorProfileHeaderDefaultGroupPreviewAuthorProfileHeaderKt.a((m) obj, ((Integer) obj2).intValue());
            case 16:
                return ComposableSingletons$PreviewAuthorProfileHeaderMinimalInfoDefaultGroupPreviewAuthorProfileHeaderMinimalInfoKt.a((m) obj, ((Integer) obj2).intValue());
            case 17:
                return ComposableSingletons$PreviewAuthorProfileSortRowDefaultGroupPreviewAuthorProfileSortRowKt.a((m) obj, ((Integer) obj2).intValue());
            case 18:
                return ComposableSingletons$PreviewAuthorProfileSortRowNoCountDefaultGroupPreviewAuthorProfileSortRowNoCountKt.a((m) obj, ((Integer) obj2).intValue());
            case 19:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 20:
                wn.f fVar = (wn.f) obj2;
                if (fVar instanceof g2) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i10 = num.intValue();
                    } else {
                        i10 = 1;
                    }
                    if (i10 == 0) {
                        return fVar;
                    }
                    return Integer.valueOf(i10 + 1);
                }
                return obj;
            case 21:
                g2 g2Var = (g2) obj;
                wn.f fVar2 = (wn.f) obj2;
                if (g2Var == null) {
                    if (fVar2 instanceof g2) {
                        return (g2) fVar2;
                    }
                    return null;
                }
                return g2Var;
            case 22:
                y yVar = (y) obj;
                wn.f fVar3 = (wn.f) obj2;
                if (fVar3 instanceof g2) {
                    g2 g2Var2 = (g2) fVar3;
                    wn.h hVar = yVar.f20747a;
                    v vVar = (v) g2Var2;
                    ThreadLocal threadLocal = vVar.f20742b;
                    Object obj3 = threadLocal.get();
                    threadLocal.set(vVar.f20741a);
                    Object[] objArr = yVar.f20748b;
                    int i11 = yVar.f20750d;
                    objArr[i11] = obj3;
                    g2[] g2VarArr = yVar.f20749c;
                    yVar.f20750d = i11 + 1;
                    g2VarArr[i11] = g2Var2;
                }
                return yVar;
            case 23:
                return Integer.valueOf(((f2) obj2).f20901a.h());
            case 24:
                return ComposableSingletons$PlayerActionsSheetKt.f((m) obj, ((Integer) obj2).intValue());
            case 25:
                return ComposableSingletons$PlayerActionsSheetKt.w1((DownloadAction) obj, (Analytics.Event.PlayerActionSource) obj2);
            case 26:
                return ComposableSingletons$PlayerActionsSheetKt.E1((PlayerDisplayMode) obj, (Analytics.Event.PlayerActionSource) obj2);
            case 27:
                return ComposableSingletons$PlayerActionsSheetKt.S0((String) obj, (Analytics.Event.PlayerActionSource) obj2);
            case 28:
                return ComposableSingletons$PlayerActionsSheetKt.U((DownloadAction) obj, (Analytics.Event.PlayerActionSource) obj2);
            default:
                return ComposableSingletons$PlayerActionsSheetKt.m1((DownloadAction) obj, (Analytics.Event.PlayerActionSource) obj2);
        }
    }
}
