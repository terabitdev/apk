package io.elevenlabs.readerapp.ui.screens.authenticated.explore.components;

import ho.l;
import ho.r;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.contents.PlayerContentsScreenKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import ir.z1;
import java.util.List;
import java.util.Map;
import r1.y;
import sn.z;
import u2.m;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15415a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15420f;

    public /* synthetic */ c(ReadMeta readMeta, l lVar, z1 z1Var, boolean z6, String str) {
        this.f15417c = readMeta;
        this.f15420f = lVar;
        this.f15418d = z1Var;
        this.f15416b = z6;
        this.f15419e = str;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        z ExploreFiltersBottomSheet$lambda$4;
        z SingleOptionFilterBottomSheet$lambda$3;
        z PlayerContentsScreen$lambda$1;
        switch (this.f15415a) {
            case 0:
                int intValue = ((Integer) obj4).intValue();
                ExploreFiltersBottomSheet$lambda$4 = ExploreFiltersBottomSheetKt.ExploreFiltersBottomSheet$lambda$4((List) this.f15417c, (Map) this.f15420f, (z0) this.f15418d, (ho.a) this.f15419e, this.f15416b, (y) obj, (BottomSheetControl) obj2, (m) obj3, intValue);
                return ExploreFiltersBottomSheet$lambda$4;
            case 1:
                int intValue2 = ((Integer) obj4).intValue();
                SingleOptionFilterBottomSheet$lambda$3 = SingleOptionFilterBottomSheetKt.SingleOptionFilterBottomSheet$lambda$3(this.f15416b, (List) this.f15417c, (z0) this.f15418d, (ho.a) this.f15419e, (l) this.f15420f, (y) obj, (BottomSheetControl) obj2, (m) obj3, intValue2);
                return SingleOptionFilterBottomSheet$lambda$3;
            default:
                int intValue3 = ((Integer) obj4).intValue();
                PlayerContentsScreen$lambda$1 = PlayerContentsScreenKt.PlayerContentsScreen$lambda$1((ReadMeta) this.f15417c, (l) this.f15420f, (z1) this.f15418d, this.f15416b, (String) this.f15419e, (y) obj, (BottomSheetControl) obj2, (m) obj3, intValue3);
                return PlayerContentsScreen$lambda$1;
        }
    }

    public /* synthetic */ c(List list, Map map, z0 z0Var, ho.a aVar, boolean z6) {
        this.f15417c = list;
        this.f15420f = map;
        this.f15418d = z0Var;
        this.f15419e = aVar;
        this.f15416b = z6;
    }

    public /* synthetic */ c(boolean z6, List list, z0 z0Var, ho.a aVar, l lVar) {
        this.f15416b = z6;
        this.f15417c = list;
        this.f15418d = z0Var;
        this.f15419e = aVar;
        this.f15420f = lVar;
    }
}
