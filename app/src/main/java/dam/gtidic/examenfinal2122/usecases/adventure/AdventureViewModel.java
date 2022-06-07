package dam.gtidic.examenfinal2122.usecases.adventure;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import dam.gtidic.examenfinal2122.utils.PreferencesProvider;

public class AdventureViewModel  extends ViewModel {
    public MutableLiveData<String> adventure;
    public MutableLiveData<Integer> qa_vides;

    //constructor
    public AdventureViewModel() {
        this.adventure = new MutableLiveData<>();
        this.qa_vides = new MutableLiveData<Integer>();
        qa_vides.setValue(0);
    }

    public void botonAdventure(){
        int vida = qa_vides.getValue() + 1;
        qa_vides.setValue(vida);
    }

    public void resetGame(){
        PreferencesProvider.providePreferences().edit().putInt("current_level",0).commit();
        int resetLevel = PreferencesProvider.providePreferences().getInt("current_level",0);

    }


}