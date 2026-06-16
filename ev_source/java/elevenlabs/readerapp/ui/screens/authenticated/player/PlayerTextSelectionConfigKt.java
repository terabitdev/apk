package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.highlighter.TextSelectionMenuConfig;
import io.elevenlabs.highlighter.TextSelectionMenuItem;
import io.elevenlabs.player.BackgroundPlayerAction;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\n\u001a\u00020\t2\u001e\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "Lsn/z;", "action", "", "pronunciationTitle", "bookmarkTitle", "", "shouldShowAddPronunciations", "Lio/elevenlabs/highlighter/TextSelectionMenuConfig;", "rememberTextSelectionMenuConfig", "(Lho/l;Ljava/lang/String;Ljava/lang/String;ZLu2/m;I)Lio/elevenlabs/highlighter/TextSelectionMenuConfig;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerTextSelectionConfigKt {
    public static final TextSelectionMenuConfig rememberTextSelectionMenuConfig(final ho.l lVar, String str, String str2, boolean z6, u2.m mVar, int i10) {
        boolean z10;
        boolean z11;
        lVar.getClass();
        str.getClass();
        str2.getClass();
        boolean z12 = false;
        if ((((i10 & 112) ^ 48) > 32 && ((u2.q) mVar).f(str)) || (i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((i10 & 896) ^ 384) > 256 && ((u2.q) mVar).f(str2)) || (i10 & 384) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = z10 | z11;
        if ((((i10 & 7168) ^ 3072) > 2048 && ((u2.q) mVar).g(z6)) || (i10 & 3072) == 2048) {
            z12 = true;
        }
        boolean z14 = z13 | z12;
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        if (z14 || L == u2.l.f33918a) {
            un.b o6 = ig.f.o();
            if (z6) {
                final int i11 = 0;
                o6.add(new TextSelectionMenuItem("pronunciation", str, new j(1), new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.l1
                    @Override // ho.r
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        sn.z rememberTextSelectionMenuConfig$lambda$0$0$1;
                        sn.z rememberTextSelectionMenuConfig$lambda$0$0$2;
                        int i12 = i11;
                        int intValue = ((Integer) obj).intValue();
                        int intValue2 = ((Integer) obj2).intValue();
                        int intValue3 = ((Integer) obj3).intValue();
                        String str3 = (String) obj4;
                        switch (i12) {
                            case 0:
                                rememberTextSelectionMenuConfig$lambda$0$0$1 = PlayerTextSelectionConfigKt.rememberTextSelectionMenuConfig$lambda$0$0$1(lVar, intValue, intValue2, intValue3, str3);
                                return rememberTextSelectionMenuConfig$lambda$0$0$1;
                            default:
                                rememberTextSelectionMenuConfig$lambda$0$0$2 = PlayerTextSelectionConfigKt.rememberTextSelectionMenuConfig$lambda$0$0$2(lVar, intValue, intValue2, intValue3, str3);
                                return rememberTextSelectionMenuConfig$lambda$0$0$2;
                        }
                    }
                }));
            }
            final int i12 = 1;
            o6.add(new TextSelectionMenuItem(BackgroundPlayerAction.Bookmark.ACTION_ID, str2, null, new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.l1
                @Override // ho.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    sn.z rememberTextSelectionMenuConfig$lambda$0$0$1;
                    sn.z rememberTextSelectionMenuConfig$lambda$0$0$2;
                    int i122 = i12;
                    int intValue = ((Integer) obj).intValue();
                    int intValue2 = ((Integer) obj2).intValue();
                    int intValue3 = ((Integer) obj3).intValue();
                    String str3 = (String) obj4;
                    switch (i122) {
                        case 0:
                            rememberTextSelectionMenuConfig$lambda$0$0$1 = PlayerTextSelectionConfigKt.rememberTextSelectionMenuConfig$lambda$0$0$1(lVar, intValue, intValue2, intValue3, str3);
                            return rememberTextSelectionMenuConfig$lambda$0$0$1;
                        default:
                            rememberTextSelectionMenuConfig$lambda$0$0$2 = PlayerTextSelectionConfigKt.rememberTextSelectionMenuConfig$lambda$0$0$2(lVar, intValue, intValue2, intValue3, str3);
                            return rememberTextSelectionMenuConfig$lambda$0$0$2;
                    }
                }
            }, 4, null));
            L = new TextSelectionMenuConfig(ig.f.i(o6));
            qVar.h0(L);
        }
        return (TextSelectionMenuConfig) L;
    }

    public static final boolean rememberTextSelectionMenuConfig$lambda$0$0$0(int i10, int i11, int i12, String str) {
        List list;
        str.getClass();
        String obj = wq.n.L0(str).toString();
        Pattern compile = Pattern.compile("\\s+");
        compile.getClass();
        obj.getClass();
        wq.n.x0(0);
        Matcher matcher = compile.matcher(obj);
        if (!matcher.find()) {
            list = ig.f.H(obj.toString());
        } else {
            ArrayList arrayList = new ArrayList(10);
            int i13 = 0;
            do {
                arrayList.add(obj.subSequence(i13, matcher.start()).toString());
                i13 = matcher.end();
            } while (matcher.find());
            arrayList.add(obj.subSequence(i13, obj.length()).toString());
            list = arrayList;
        }
        if (list.size() > 4) {
            return false;
        }
        return true;
    }

    public static final sn.z rememberTextSelectionMenuConfig$lambda$0$0$1(ho.l lVar, int i10, int i11, int i12, String str) {
        str.getClass();
        lVar.invoke(new y1(str, 12));
        return sn.z.f31622a;
    }

    public static final sn.z rememberTextSelectionMenuConfig$lambda$0$0$1$0(String str, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onAddPronunciation(str);
        return sn.z.f31622a;
    }

    public static final sn.z rememberTextSelectionMenuConfig$lambda$0$0$2(ho.l lVar, final int i10, final int i11, final int i12, String str) {
        str.getClass();
        lVar.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.k1
            @Override // ho.l
            public final Object invoke(Object obj) {
                sn.z rememberTextSelectionMenuConfig$lambda$0$0$2$0;
                rememberTextSelectionMenuConfig$lambda$0$0$2$0 = PlayerTextSelectionConfigKt.rememberTextSelectionMenuConfig$lambda$0$0$2$0(i10, i11, i12, (PlayerViewModel) obj);
                return rememberTextSelectionMenuConfig$lambda$0$0$2$0;
            }
        });
        return sn.z.f31622a;
    }

    public static final sn.z rememberTextSelectionMenuConfig$lambda$0$0$2$0(int i10, int i11, int i12, PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.onAddBookmarkFromRange(i10, new StringRange(i11, i12 - 1));
        return sn.z.f31622a;
    }
}
