package io.elevenlabs.readerapp.ui.screens.authenticated.assistant;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.BluetoothActionSelectorSheetKt;
import io.elevenlabs.ui.components.RadioButtonKt;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f15087c;

    public /* synthetic */ a(int i10, String str, boolean z6) {
        this.f15085a = i10;
        this.f15086b = z6;
        this.f15087c = str;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z AssistantHeader$lambda$0;
        sn.z ActionItem$lambda$0;
        sn.z RadioButton$lambda$2;
        switch (this.f15085a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                AssistantHeader$lambda$0 = AskAssistantSheetKt.AssistantHeader$lambda$0(this.f15086b, this.f15087c, (l2) obj, (u2.m) obj2, intValue);
                return AssistantHeader$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj3).intValue();
                ActionItem$lambda$0 = BluetoothActionSelectorSheetKt.ActionItem$lambda$0(this.f15086b, this.f15087c, (r1.s) obj, (u2.m) obj2, intValue2);
                return ActionItem$lambda$0;
            default:
                int intValue3 = ((Integer) obj3).intValue();
                RadioButton$lambda$2 = RadioButtonKt.RadioButton$lambda$2(this.f15086b, this.f15087c, (l2) obj, (u2.m) obj2, intValue3);
                return RadioButton$lambda$2;
        }
    }
}
